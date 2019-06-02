package kz.kassayev.indriver.service.calculator;

import kz.kassayev.indriver.exception.ListIsEmptyException;
import kz.kassayev.indriver.model.AbstractCar;
import org.apache.log4j.Logger;

import java.util.List;

public class TotalCostOfTaxiParkImpl implements TotalCostOfTaxiPark {
    private final static Logger logger = Logger.getLogger(TotalCostOfTaxiParkImpl.class);

    /**
     * This class calculate price of cars in taxi park
     *
     * @param cars
     * @return total amount price
     */
    @Override
    public int priceOfAllCars(List<AbstractCar> cars) throws ListIsEmptyException {
        int sum = 0;
        if (cars.size() != 0) {
            logger.info("calculate price of all cars");
            for (AbstractCar car : cars) {
                sum += car.getPrice();
            }
        } else {
            throw new ListIsEmptyException("List is empty");
        }
        return sum;
    }
}
