package kz.kassayev.indriver.service.sort;

import kz.kassayev.indriver.model.AbstractCar;

import java.util.List;

public interface SortByFuelConsumtion {
    List<AbstractCar> sortByFuelEconomy(List<AbstractCar> cars);
}
