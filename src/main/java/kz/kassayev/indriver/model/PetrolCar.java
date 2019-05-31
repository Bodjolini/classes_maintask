package kz.kassayev.indriver.model;

/**
 * This class hier class AbstractCar
 */
public class PetrolCar extends AbstractCar {
    private FuelType fuelType;
    private int fuelTankCapacity;
    private int fuelConsumption;

    public PetrolCar(Mark mark, String model, BodyType bodyType, int price, int year, int milage, int maxSpeed, boolean automat, double acceleration, int numberOfSeats, boolean conditioner, FuelType fuelType, int fuelTankCapacity, int fuelConsumption) {
        super(mark, model, bodyType, price, year, milage, maxSpeed, automat, acceleration, numberOfSeats, conditioner);
        this.fuelType = fuelType;
        this.fuelTankCapacity = fuelTankCapacity;
        this.fuelConsumption = fuelConsumption;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public int getFuelTankCapacity() {
        return fuelTankCapacity;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    @Override
    public String toString() {
        return "PetrolCar{" +
                super.toString() +
                "fuelType=" + fuelType +
                ", fuelTankCapacity=" + fuelTankCapacity +
                ", fuelConsumption=" + fuelConsumption +
                '}';
    }
}
