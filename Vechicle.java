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