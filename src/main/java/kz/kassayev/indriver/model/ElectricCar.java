package kz.kassayev.indriver.model;

/**
 * This class hier class AbstractCar
 */
public class ElectricCar extends AbstractCar {
    private BatteryType batteryType;
    private int chargingTime;
    private int lifeTimeOfBattery;

    public ElectricCar(Mark mark, String model, BodyType bodyType, int price, int year, int milage, int maxSpeed, boolean automat, double acceleration, int numberOfSeats, boolean conditioner, BatteryType batteryType, int chargingTime, int lifeTimeOfBattery) {
        super(mark, model, bodyType, price, year, milage, maxSpeed, automat, acceleration, numberOfSeats, conditioner);
        this.batteryType = batteryType;
        this.chargingTime = chargingTime;
        this.lifeTimeOfBattery = lifeTimeOfBattery;
    }

    public BatteryType getBatteryType() {
        return batteryType;
    }

    public int getChargingTime() {
        return chargingTime;
    }

    public int getLifeTimeOfBattery() {
        return lifeTimeOfBattery;
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "mark=" + mark +
                ", model='" + model + '\'' +
                ", bodyType=" + bodyType +
                ", price=" + price +
                ", year=" + year +
                ", milage=" + milage +
                ", maxSpeed=" + maxSpeed +
                ", automat=" + automat +
                ", acceleration=" + acceleration +
                ", numberOfSeats=" + numberOfSeats +
                ", conditioner=" + conditioner +
                ", batteryType=" + batteryType +
                ", chargingTime=" + chargingTime +
                ", lifeTimeOfBattery=" + lifeTimeOfBattery +
                '}';
    }
}
