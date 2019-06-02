package kz.kassayev.indriver.service.search;

import kz.kassayev.indriver.exception.ThereIsNoSuchSpeedRange;
import kz.kassayev.indriver.model.AbstractCar;

import java.util.ArrayList;
import java.util.List;

public class SearchBySpeedRangeImpl implements SeachBySpeedRange {
    /**
     * User set parametrs
     *
     * @param cars
     * @param min
     * @param max
     * @return get list of cars, which this speed range
     */
    @Override
    public List<AbstractCar> searchBySpeedRange(List<AbstractCar> cars, int min, int max) throws ThereIsNoSuchSpeedRange {
        List<AbstractCar> carSelection = new ArrayList<>();

        boolean speedAviable = false;
        for (AbstractCar car : cars) {
            if (car.getMaxSpeed() >= min && car.getMaxSpeed() <= max) {
                speedAviable = true;
                carSelection.add(car);
            }
        }
        if (!speedAviable) {
            throw new ThereIsNoSuchSpeedRange("there is no such speed range : " + min + " - " + max);
        }
        return carSelection;
    }
}
