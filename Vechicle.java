package parkingSystemManagement;

abstract class Vechicle {
    String licensePlate;
    String ownerName;
       
    public Vechicle(String licensePlate, String ownerName) {
        this.licensePlate = licensePlate;
        this.ownerName = ownerName;
    }
    abstract void parkCar(ParkingLot lot);
    abstract void removeCar(ParkingLot lot);
}  

class Car extends Vechicle {
    boolean isParked;

    Car(String licensePlate, String ownerName) {
        super(licensePlate, ownerName);
        this.isParked = false;
    }

    @Override
    public void parkCar(ParkingLot lot) {
        lot.parkTheCar();
        this.isParked = true;
        System.out.println("Car with license plate " + this.licensePlate + " is now parked.");
    }

    @Override
    public void removeCar(ParkingLot lot) {
        lot.removeTheCar();
        this.isParked = false;
        System.out.println("Car with license plate " + this.licensePlate + " has left the parking lot.");
    }
}

class Truck extends Vechicle {
    boolean isParked;

    Truck(String licensePlate, String ownerName) {
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
