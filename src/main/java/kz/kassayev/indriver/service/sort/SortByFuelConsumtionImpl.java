package kz.kassayev.indriver.service.sort;

import kz.kassayev.indriver.model.AbstractCar;
import kz.kassayev.indriver.model.ElectricCar;
import kz.kassayev.indriver.model.PetrolCar;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortByFuelConsumtionImpl implements SortByFuelConsumtion {
    final static Logger logger = Logger.getLogger(SortByFuelConsumtionImpl.class);

    /**
     * At first determines class instance, then assign.
     * then sorts separately, because electric car it has different results
     *
     * @param cars
     * @return get sorted list
     */
    @Override
    public List<AbstractCar> sortByFuelEconomy(List<AbstractCar> cars) {
        List<PetrolCar> petrolCars = new ArrayList<>();
        List<ElectricCar> electricCars = new ArrayList<>();
        List<AbstractCar> result = new ArrayList<>();

        for (AbstractCar car : cars) {
            if (car instanceof ElectricCar) {
                electricCars.add((ElectricCar) car);
            } else if (car instanceof PetrolCar) {
                petrolCars.add((PetrolCar) car);
            }
        }

        logger.info("sorting begins...");
        electricCars.sort(Comparator.comparing(ElectricCar::getLifeTimeOfBattery));
        petrolCars.sort(Comparator.comparing(PetrolCar::getFuelConsumption));
        result.addAll(electricCars);
        result.addAll(petrolCars);
        return result;
    }
}
