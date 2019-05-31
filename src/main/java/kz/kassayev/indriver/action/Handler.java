package kz.kassayev.indriver.action;

import kz.kassayev.indriver.model.AbstractCar;

import java.util.List;

public interface Handler {
    List<AbstractCar> showAllCars(List<AbstractCar> cars);

    int priceOfAllCars(List<AbstractCar> cars);

    List<AbstractCar> searchBySpeedRange(List<AbstractCar> cars, int min, int max);

    List<AbstractCar> sortyByFuelEconomy(List<AbstractCar> cars);
}
