package kz.kassayev.indriver.service.impl;

import kz.kassayev.indriver.model.AbstractCar;
import kz.kassayev.indriver.model.ElectricCar;
import kz.kassayev.indriver.model.PetrolCar;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortImpl implements Sort {
    /**
     * At first determines class instance, then assign.
     * then sorts separately, because electric car it has different results
     *
     * @param cars
     * @return get sorted list
     */
    @Override
    public List<AbstractCar> sortyByFuelEconomy(List<AbstractCar> cars) {
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

        electricCars.sort(Comparator.comparing(ElectricCar::getLifeTimeOfBattery));
        petrolCars.sort(Comparator.comparing(PetrolCar::getFuelConsumption));
        result.addAll(electricCars);
        result.addAll(petrolCars);
        return result;
    }
}
