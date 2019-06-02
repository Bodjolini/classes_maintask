package kz.kassayev.indriver.service.calculator;

import kz.kassayev.indriver.exception.ListIsEmptyException;
import kz.kassayev.indriver.model.AbstractCar;

import java.util.List;

public interface TotalCostOfTaxiPark {
    int priceOfAllCars(List<AbstractCar> cars) throws ListIsEmptyException;
}
