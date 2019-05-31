package kz.kassayev.indriver.model.bigcars;

import kz.kassayev.indriver.model.FuelType;
import kz.kassayev.indriver.model.Mark;
import kz.kassayev.indriver.model.PetrolCar;
import kz.kassayev.indriver.model.BodyType;
import kz.kassayev.indriver.service.Passenger;

/**
 * This class for implementing interfaces, separate class from the work of taxis
 */
public class Bus extends PetrolCar implements Passenger {
    private boolean panoramicRoof;
    private int passengerCount;

    public Bus(Mark mark, String model, BodyType bodyType, int price, int year, int milage, int maxSpeed, boolean automat, double acceleration, int numberOfSeats, boolean conditioner, FuelType fuelType, int fuelTankCapacity, int fuelConsumption, boolean panoramicRoof) {
        super(mark, model, bodyType, price, year, milage, maxSpeed, automat, acceleration, numberOfSeats, conditioner, fuelType, fuelTankCapacity, fuelConsumption);
        this.panoramicRoof = panoramicRoof;
    }

    /**
     * I set passengers in this bus
     *
     * @param passengers
     */
    @Override
    public void addPassenger(int passengers) {
        if (passengers > numberOfSeats) {
            int otherPassengers;
            otherPassengers = passengers - numberOfSeats;
            System.out.println("OTHER " + otherPassengers + " PASSANGERS WILL WALL, BECAUSE " + numberOfSeats + " SEATS.");
            passengerCount = numberOfSeats;
        } else {
            System.out.println("PASSANGERS ASSIGNED.");
            passengerCount = passengers;
        }
    }

    /**
     * That get passengers count who got on the bus
     *
     * @return count passengers
     */
    @Override
    public int getPassengerCount() {
        return passengerCount;
    }
}
