public class Truck extends Vehicle {
    boolean isParked;

    public Truck(String licensePlate, String ownerName) {
        super(licensePlate, ownerName);
        this.isParked = false;
    }

    @Override
    public void parkCar(ParkingLot lot) {
        lot.parkTheCar();
        this.isParked = true;
        System.out.println("Truck with license plate " + this.licensePlate + " is now parked.");
    }

    @Override
    public void removeCar(ParkingLot lot) {
        lot.removeTheCar();
        this.isParked = false;
        System.out.println("Truck with license plate " + this.licensePlate + " has left the parking lot.");
    }
}