package kz.kassayev.indriver.controller;

import kz.kassayev.indriver.model.AbstractCar;
import kz.kassayev.indriver.report.CarReport;
import kz.kassayev.indriver.report.CarReportImpl;
import kz.kassayev.indriver.service.calculator.TotalCostOfTaxiPark;
import kz.kassayev.indriver.service.calculator.TotalCostOfTaxiParkImpl;
import kz.kassayev.indriver.service.impl.Sort;
import kz.kassayev.indriver.service.impl.SortImpl;
import kz.kassayev.indriver.service.search.SeachBySpeedRange;
import kz.kassayev.indriver.service.search.SearchBySpeedRangeImpl;

import java.util.List;
import java.util.Scanner;

public class Controller {
    private List<AbstractCar> carList;
    private Scanner input;
    Sort sort = new SortImpl();
    TotalCostOfTaxiPark totalCostOfTaxiPark = new TotalCostOfTaxiParkImpl();
    SeachBySpeedRange seachBySpeedRange = new SearchBySpeedRangeImpl();
    CarReport carReport = new CarReportImpl();

    public Controller(List<AbstractCar> carList, Scanner input) {
        this.carList = carList;
        this.input = input;
    }

    public void categoiresOfMenu(){
        System.out.println("[---------MENU----------]");
        System.out.println("[--CHOOSE BY NUMBERING--]");
        System.out.println("[1] LOOK AT ALL THE CARS");
        System.out.println("[2] TOTAL AMOUNT PRICE OF CARS");
        System.out.println("[3] SPEED RANGE SELECTION");
        System.out.println("[4] SORT CARS BY ECONOMY");
        System.out.println("[5] EXIT");
    }

    private void massageAboutBackToMenu(){
        System.out.println("PRESS 0 BACK IN THE MENU");
    }
    public void menu(){
        int selection;

        do {

            selection = input.nextInt();
            switch (selection) {
                case 0:
                    categoiresOfMenu();
                    break;
                case 1:
                    carReport.cycleForSout(carList);
                    massageAboutBackToMenu();
                    break;
                case 2:
                    System.out.println("TOTAL AMOUNT PRICE OF ALL TAXI-CARS : " + totalCostOfTaxiPark.priceOfAllCars(carList) + "$");
                    massageAboutBackToMenu();
                    break;
                case 3:
                    System.out.println("SPEED RANGE SELECTION : ");
                    System.out.println("Enter min sped");
                    int min = input.nextInt();
                    System.out.println("Enter max sped");
                    int max = input.nextInt();
                    List<AbstractCar> carbySpeed = seachBySpeedRange.searchBySpeedRange(carList, min, max);
                    carReport.cycleForSout(carbySpeed);
                    massageAboutBackToMenu();
                    break;
                case 4:
                    System.out.println("SORT CARS BY ECONOMY (AT FIRST ELECTRIC, THEN PETROL) : ");
                    List<AbstractCar> carbyEconomy = sort.sortyByFuelEconomy(carList);
                    carReport.cycleForSout(carbyEconomy);
                    massageAboutBackToMenu();
                    break;
                case 5:
                    System.out.println("[----------BYE----------]");
                    break;
                default:
                    System.out.println("INVALID, PLEASE REPEAT");
            }

        } while (selection != 5);
    }
}
