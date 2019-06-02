package kz.kassayev.indriver.report;

import kz.kassayev.indriver.exception.ListIsEmptyException;
import kz.kassayev.indriver.model.AbstractCar;

import java.util.List;

public interface CarReport {
    void cycleForSout(List<AbstractCar> cars) throws ListIsEmptyException;
}
