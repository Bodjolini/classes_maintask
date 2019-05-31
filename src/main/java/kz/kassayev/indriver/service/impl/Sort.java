package kz.kassayev.indriver.service.impl;

import kz.kassayev.indriver.model.AbstractCar;

import java.util.List;

public interface Sort {
    List<AbstractCar> sortyByFuelEconomy(List<AbstractCar> cars);
}
