package kz.kassayev.indriver.model.bigcars;

import kz.kassayev.indriver.model.FuelType;
import kz.kassayev.indriver.model.Mark;
import kz.kassayev.indriver.model.PetrolCar;
import kz.kassayev.indriver.model.BodyType;
import kz.kassayev.indriver.service.Passenger;
import kz.kassayev.indriver.service.Freight;

/**
 * This class for implementing interfaces, separate class from the work of taxis
 */
public class Van extends PetrolCar implements Passenger, Freight {
    private short freightId = 0;
    private int passengers = 0;
    private double freightWeight = 0;
    private int passengerCount;

    public Van(Mark mark, String model, BodyType bodyType, int price, int year, int milage, int maxSpeed, boolean automat, double acceleration, int numberOfSeats, boolean conditioner, FuelType fuelType, int fuelTankCapacity, int fuelConsumption, short freightId, int passengers, double freightWeight) {
        super(mark, model, bodyType, price, year, milage, maxSpeed, automat, acceleration, numberOfSeats, conditioner, fuelType, fuelTankCapacity, fuelConsumption);
        this.freightId = freightId;
        this.passengers = passengers;
        this.freightWeight = freightWeight;
    }

    /**
     * I set passengers in this van
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
     * That get passengers count who got on the van
     *
     * @return
     */
    @Override
    public int getPassengerCount() {
        return passengerCount;
    }

    /**
     * Id of freight
     *
     * @return get Id
     */
    @Override
    public short getFreightId() {
        if (freightId == 0) {
            System.out.println("There is no load in the car");
        }
        return freightId;
    }

    /**
     * weight of freight
     *
     * @return get freight weight
     */
    @Override
    public double getFreightWeight() {
        if (freightWeight == 0) {
            System.out.println("There is no load in the car");
        }
        return freightWeight;
    }
}
