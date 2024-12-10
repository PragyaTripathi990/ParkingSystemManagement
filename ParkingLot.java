package parkingSystemManagement;

import java.util.Scanner;

public class ParkingLot {
    int totalSlots;
    boolean[] slots;
    Scanner sc = new Scanner(System.in);
    public ParkingLot(int t) {
            this.totalSlots = t;
            this.slots = new boolean[totalSlots];
        }
        void choose() {
            while(true) {
                System.out.println("Menu :");
                System.out.println("1. Park the car");
                System.out.println("2. Remove the car");
                System.out.println("3. view slots");
                System.out.println("4. return");
                System.out.println("Please enter your choice :");
                int n = sc.nextInt();

                switch(n) {
                    case 1:
                        parkTheCar();
                        break;

                    case 2:
                        removeTheCar();
                        break;
                    
                    case 3:
                    viewSlots();
                    break;

                    case 4: 
                    System.out.println("exicting choice....thankyou");
                    return;

                    default:
                    System.out.println("invalid Choice! try again");
                    }    
                }
        }
                    public void parkTheCar() {
                        for (int i = 0; i < this.totalSlots; i++) {
                            if(!slots[i]) {
                                slots[i] = true;
                                System.out.println("car is parked in slot" + (i + 1));
                                return;
                            }
                        }   
                        System.out.println("No vacant slots available");
                    }
                    public void removeTheCar() {
                        System.out.println("Enter the slot number you want to remove (1 to " + totalSlots);
                        int remove = sc.nextInt();
                        if (remove >= 1 && remove <= totalSlots) {
                            if (slots[remove - 1]) {
                                slots[remove - 1] = false;
                                System.out.println("car removed from slot: " + remove);
                            } else {
                                System.out.println("the slot is already empty.");
                            }
                        } else {
                            System.out.println("Invalid slot number. Please enter a number between 1 and " + totalSlots);
                        }
                    }       
                    public void viewSlots() {
                        for (int i = 0; i < this.totalSlots; i++) {
                           if (slots[i] == true) {
                              System.out.println("slot " + (i + 1) + ": occupied");
                           } else {
                            System.out.println("slot " + (i + 1) + ": empty");
                           }
                        }
                    }
                }