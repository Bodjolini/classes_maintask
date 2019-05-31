package kz.kassayev.indriver.service.calculator;

import kz.kassayev.indriver.model.AbstractCar;

import java.util.List;

public class TotalCostOfTaxiParkImpl implements TotalCostOfTaxiPark {
    /**
     * This class calculate price of cars in taxi park
     *
     * @param cars
     * @return total amount price
     */
    @Override
    public int priceOfAllCars(List<AbstractCar> cars) {
        int sum = 0;
        for (AbstractCar car : cars) {
            sum += car.getPrice();
        }
        return sum;
    }
}
