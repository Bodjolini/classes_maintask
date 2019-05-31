package kz.kassayev.indriver.park;

import kz.kassayev.indriver.model.AbstractCar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Create autopark for taxi cars
 */
public class TaxiPark {
    private String name;
    private List<AbstractCar> taxipark = new ArrayList<>();

    public TaxiPark(String name) {
        this.name = name;
    }

    public void addCar(AbstractCar car) {
        taxipark.add(car);
    }

    public String getName() {
        return name;
    }

    public List<AbstractCar> getTaxipark() {
        return Collections.unmodifiableList(taxipark);
    }
}
