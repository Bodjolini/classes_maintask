package kz.kassayev.indriver.controller;

import kz.kassayev.indriver.exception.ListIsEmptyException;
import kz.kassayev.indriver.exception.ThereIsNoSuchSpeedRange;
import kz.kassayev.indriver.model.AbstractCar;
import kz.kassayev.indriver.report.CarReport;
import kz.kassayev.indriver.report.CarReportImpl;
import kz.kassayev.indriver.service.calculator.TotalCostOfTaxiPark;
import kz.kassayev.indriver.service.calculator.TotalCostOfTaxiParkImpl;
import kz.kassayev.indriver.service.sort.SortByFuelConsumtion;
import kz.kassayev.indriver.service.sort.SortByFuelConsumtionImpl;
import kz.kassayev.indriver.service.search.SeachBySpeedRange;
import kz.kassayev.indriver.service.search.SearchBySpeedRangeImpl;
import org.apache.log4j.Logger;

import java.util.List;
import java.util.Scanner;

public class Controller {
    final static Logger logger = Logger.getLogger(Controller.class);
    private List<AbstractCar> carList;
    private Scanner input;
    SortByFuelConsumtion sortByFuelConsumtion = new SortByFuelConsumtionImpl();
    TotalCostOfTaxiPark totalCostOfTaxiPark = new TotalCostOfTaxiParkImpl();
    SeachBySpeedRange seachBySpeedRange = new SearchBySpeedRangeImpl();
    CarReport carReport = new CarReportImpl();

    public Controller(List<AbstractCar> carList, Scanner input) {
        this.carList = carList;
        this.input = input;
    }

    public void categoriesOfMenu() {
        logger.info("opening menu");
        System.out.println("[---------MENU----------]");
        System.out.println("[--CHOOSE BY NUMBERING--]");
        System.out.println("[1] LOOK AT ALL THE CARS");
        System.out.println("[2] TOTAL AMOUNT PRICE OF CARS");
        System.out.println("[3] SPEED RANGE SELECTION");
        System.out.println("[4] SORT CARS BY ECONOMY");
        System.out.println("[5] EXIT");
    }

    private void massageAboutBackToMenu() {
        System.out.println("PRESS 0 BACK IN THE MENU");
    }

    public void menu() {
        int selection;
        do {
            selection = input.nextInt();
            switch (selection) {
                case 0:
                    categoriesOfMenu();
                    break;
                case 1:
                    try {
                        carReport.cycleForSout(carList);
                    } catch (ListIsEmptyException e) {
                        logger.error(e);
                    } finally {
                        massageAboutBackToMenu();
                    }
                    break;
                case 2:
                    try {
                        System.out.println("TOTAL AMOUNT PRICE OF ALL TAXI-CARS : " + totalCostOfTaxiPark.priceOfAllCars(carList) + "$");
                    } catch (ListIsEmptyException e) {
                        logger.error(e);
                    } finally {
                        massageAboutBackToMenu();
                    }
                    break;
                case 3:
                    System.out.println("SPEED RANGE SELECTION : ");
                    System.out.println("Enter min speed");
                    int min = input.nextInt();
                    System.out.println("Enter max speed");
                    int max = input.nextInt();

                    try {
                        List<AbstractCar> carbySpeed = seachBySpeedRange.searchBySpeedRange(carList, min, max);
                        try {
                            carReport.cycleForSout(carbySpeed);
                        } catch (ListIsEmptyException e) {
                            logger.error(e);
                        }
                    } catch (ThereIsNoSuchSpeedRange e) {
                        logger.warn(e);
                    } finally {
                        massageAboutBackToMenu();
                    }
                    break;
                case 4:
                    try {
                        System.out.println("SORT CARS BY ECONOMY (AT FIRST ELECTRIC, THEN PETROL) : ");
                        List<AbstractCar> carbyEconomy = sortByFuelConsumtion.sortByFuelEconomy(carList);
                        carReport.cycleForSout(carbyEconomy);
                    } catch (ListIsEmptyException e) {
                        logger.error(e);
                    } finally {
                        massageAboutBackToMenu();
                    }
                    break;
                case 5:
                    System.out.println("[----------BYE----------]");
                    logger.info("exit menu");
                    break;
                default:
                    System.out.println("INVALID, PLEASE REPEAT");
            }

        } while (selection != 5);
    }
}
