package kz.kassayev.indriver.service.search;

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
    public List<AbstractCar> searchBySpeedRange(List<AbstractCar> cars, int min, int max) {
        List<AbstractCar> carSelection = new ArrayList<>();
        boolean speed = false;
        for (AbstractCar car : cars) {
            if (car.getMaxSpeed() >= min && car.getMaxSpeed() <= max) {
                speed = true;
                carSelection.add(car);
            }
        }
        if (!speed){
            System.out.println("CARS IN THIS RANGE NO");
        }
        return carSelection;
    }
}
