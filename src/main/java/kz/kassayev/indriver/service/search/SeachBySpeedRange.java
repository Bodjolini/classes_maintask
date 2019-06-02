package kz.kassayev.indriver.service.search;

import kz.kassayev.indriver.exception.ThereIsNoSuchSpeedRange;
import kz.kassayev.indriver.model.AbstractCar;

import java.util.List;

public interface SeachBySpeedRange {
    List<AbstractCar> searchBySpeedRange(List<AbstractCar> cars, int min, int max) throws ThereIsNoSuchSpeedRange;
}
