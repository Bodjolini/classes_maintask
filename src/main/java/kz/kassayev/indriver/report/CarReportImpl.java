package kz.kassayev.indriver.report;

import kz.kassayev.indriver.exception.ListIsEmptyException;
import kz.kassayev.indriver.model.AbstractCar;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.util.List;

public class CarReportImpl implements CarReport {
    private final static Logger logger = Logger.getLogger(CarReportImpl.class);
    /**
     * this method is not to write the loop again
     *
     * @param cars
     */
    @Override
    public void cycleForSout(List<AbstractCar> cars) throws ListIsEmptyException {
        if (cars.size() != 0) {
            logger.info("Cycle for sout got list");
            for (AbstractCar car : cars) {
                System.out.println(car);
            }
        } else {
            throw new ListIsEmptyException("List is empty");
        }
    }
}

