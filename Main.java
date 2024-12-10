package parkingSystemManagement;

public class Main {
    public static void main(String[] args) {
        Driver driver = new Driver("Jatin", "Truck");
        ParkingLot lot = new ParkingLot(6);
        Vehicle car = new Car("RJ14 2007", "Jai");
        Vehicle truck = new Truck("RJ14 9407", "Raj");

        driver.enteredTheParkingLot();
        car.parkCar(lot);
        truck.parkCar(lot);

        lot.viewSlots();

        car.removeCar(lot);
        truck.removeCar(lot);
        driver.exitedTheParkingLot();
    }
}
