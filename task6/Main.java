import java.lang.Integer;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class Main {
    public static final int TRAINER_RESERVATION_MAX = 15;
    public static final int CLASS_CAPACITY_MAX = 6;
    // Assuming 9 hour day 0800 - 1700
    public static final int ROOM_RESERVATION_MAX = 9;

    // Collection of classes available
    public static ArrayList<SportClass> catalog = new ArrayList<SportClass>();

    // Gym rooms
    public static Room[] rooms = new Room[] {
        new Room(RoomNames.Room1),
        new Room(RoomNames.Room2),
        new Room(RoomNames.Room3),
        new Room(RoomNames.Room4),
        new Room(RoomNames.Room5)
    };

    public static void classRegister(Customer customer, SportClass sportClass) {
        System.out.print(customer.name + " ");
        
        if (sportClass.isCustomerInClass(customer)) {
            System.out.println("Already signed up.");
            return;
        } 
        
        if (sportClass.isFull()) {
            System.out.println("Class is full");
            return;
        }
        
        if (customer.hours < sportClass.classDuration()) {
            System.out.println("Lack of hours");
            return;
        }
        
        for (int i = 0; i < sportClass.customers.length; i++) {
            if (sportClass.customers[i] == null) {
                sportClass.customers[i] = customer;
                customer.hours -= sportClass.classDuration();
                System.out.println("Customer successfully registered for class!");
                System.out.println("Customer remaining hours: " + customer.hours);
                System.out.println("Class information: " + sportClass.roomReservation.printRoomReservation());
                break;
            }
        }
    }
    

    public static void main(String[] args) {
        System.out.println("Initializing gym...");
        Owner owner = new Owner("Owen", "OWilsonWow", "password123", "123456789");
        Trainer trainerJack = new Trainer("Jack", "JBlack", "password123", "123456789");
        Customer jack = new Customer("Joe", "JSmith", "password123", "123456789");
        Customer alice = new Customer("Alice", "AliceInWonderland", "password123", "123456789");
        Customer bob = new Customer("Bob", "BobTheBuilder", "password123", "123456789");
        Customer jon = new Customer("Jon", "JonSnow", "password123", "123456789");

        int demoCapacity = 1;
        int demoDuration = 2;
        int demoHoursSufficent = 3;
        int demoHoursInsufficent = 1;
        // tomorrow at 1000 utc
        Date demoDate = new Date(System.currentTimeMillis() + 86400000);
        System.out.println("!--------------------- Sequence demo ---------------------!");

    }
}