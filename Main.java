package parkingSystemManagement;

public class Main {
    public static void main(String[] args) {

        Driver drive = new Driver("Jatin", "Truck");
        ParkingLot lot = new ParkingLot(6); 
        Vechicle v1 = new Car("RJ14 2007", "Jai");
        Vechicle v2 = new Truck("RJ14 9407", "Raj");


        drive.enteredTheParkingLot();
        
        v1.parkCar(lot);
        v2.parkCar(lot);
        
        lot.viewSlots();

       
        v1.removeCar(lot);
        v2.removeCar(lot);

        drive.exitedTheParkingLot();
    }
}
