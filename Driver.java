package parkingSystemManagement;

public class Driver {
    String name;
    String vechileType;
        Driver(String n, String v) {
            this.name = n;
            this.vechileType = v;
        }
        void enteredTheParkingLot() {
            System.out.println("driver" + this.name + "has entered with car " + this.vechileType);
        }
        void exitedTheParkingLot() {
            System.out.println("driver" + this.name + "has left with car " + this.vechileType);
        }
    }
