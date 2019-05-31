package kz.kassayev.indriver;

import kz.kassayev.indriver.model.*;
import kz.kassayev.indriver.park.TaxiPark;
import kz.kassayev.indriver.park.Handler;
import kz.kassayev.indriver.report.CarReportImpl;

import java.util.List;

/**
 * 10. Таксопарк.
 */
public class Main {

    public static void main(String[] args) {
        TaxiPark taxiPark = new TaxiPark("Indriver Nur~Sultan");
        Handler handler = new Handler();
        CarReportImpl carReportImpl = new CarReportImpl();

        taxiPark.addCar(new ElectricCar(Mark.TESLA, "Model S", BodyType.SEDAN, 82_000, 2015, 34_000, 230, true, 5.5, 4, true, BatteryType.ALUMINUM_ION, 400, 350));
        taxiPark.addCar(new ElectricCar(Mark.TESLA, "Model 3", BodyType.SEDAN, 44_000, 2015, 75_000, 210, true, 4.8, 4, true, BatteryType.ALUMINUM_ION, 300, 270));
        taxiPark.addCar(new PetrolCar(Mark.LEXUS, "HS 250", BodyType.HATCHBACK, 30_000, 2010, 120_000, 180, false, 3.0, 5, true, FuelType.PETROL_AND_GAS, 70, 8));
        taxiPark.addCar(new PetrolCar(Mark.TOYOTA, "Camry V55", BodyType.SEDAN, 35_000, 2014, 56_000, 210, true, 4.2, 4, true, FuelType.PETROL, 70, 11));
        taxiPark.addCar(new PetrolCar(Mark.MERCEDES_BENZ, "E 350d", BodyType.ESTATE, 67_000, 2011, 80_000, 250, true, 4.3, 4, true, FuelType.DIESEL, 80, 9));

        System.out.println("ALL TAXI-CARS : ");
        List<AbstractCar> allCars = handler.showAllCars(taxiPark.getTaxipark());
        carReportImpl.cycleForSout(allCars);

        System.out.println("TOTAL AMOUNT PRICE OF ALL TAXI-CARS : " + handler.allCarsCost(taxiPark.getTaxipark()) + "$");

        System.out.println("SPEED RANGE SELECTION : ");
        List<AbstractCar> carbySpeed = handler.showBySpeedRange(taxiPark.getTaxipark(), 200, 220);
        carReportImpl.cycleForSout(carbySpeed);

        System.out.println("SORT CARS BY ECONOMY (AT FIRST ELECTRIC, THEN PETROL) : ");
        List<AbstractCar> carbyEconomy = handler.sortyByFuelEconomy(taxiPark.getTaxipark());
        carReportImpl.cycleForSout(carbyEconomy);
    }
}
