package kz.kassayev.indriver.report;

import kz.kassayev.indriver.model.AbstractCar;

import java.util.List;

public class CarReportImpl implements CarReport {
    /**
     * this method is not to write the loop again
     *
     * @param cars
     */
    @Override
    public void cycleForSout(List<AbstractCar> cars) {
        for (AbstractCar car : cars) {
            System.out.println(car);
        }
    }
}

