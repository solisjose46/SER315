import java.lang.Integer;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class Main {
    public static final int TRAINER_RESERVATION_MAX = 15;
    public static final int CLASS_CAPACITY_MAX = 6;
    // Assuming 9 hour day 0800 - 1700
    public static final int ROOM_RESERVATION_MAX = 9;

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

        if (customer.hours < sportClass.classDuration()) {
            System.out.println("Lack of hours");
            return;
        }
        
        if (sportClass.isFull()) {
            System.out.println("Class is full");
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
        Customer joe = new Customer("Joe", "JSmith", "password123", "123456789");
        Customer alice = new Customer("Alice", "AliceInWonderland", "password123", "123456789");
        Customer bob = new Customer("Bob", "BobTheBuilder", "password123", "123456789");
        Customer jon = new Customer("Jon", "JonSnow", "password123", "123456789");

        // create demo start time and end time starting from 1000 to 1200 tomorrow utc
        Date demoStartTime = new Date(1674122400);
        Date demoEndTime = new Date(1674129600);

        int demoCapacity = 1;
        int demoHoursSufficent = 3;
        int demoHoursInsufficent = 1;
        
        // allocate hours for demo
        joe.hours = demoHoursSufficent;
        alice.hours = demoHoursSufficent;
        bob.hours = demoHoursSufficent;
        jon.hours = demoHoursInsufficent;

        int demoClassID = new Random().nextInt(1000);
        
        // create demo room reservation
        RoomReservation demoRoomReservation = new RoomReservation(demoStartTime, demoEndTime, rooms[0], trainerJack);
        // create demo sport class with Judo and demo room reservation
        SportClass demoSportClass = new SportClass(Sports.Judo, false, demoClassID, demoCapacity, demoRoomReservation, trainerJack);

        System.out.println("!--------------------- Sequence demo ---------------------!");

        // Successful register
        classRegister(joe, demoSportClass);
        // Already signed up
        classRegister(joe, demoSportClass);
        // Lack of hours
        classRegister(jon, demoSportClass);
        // Class is full
        classRegister(alice, demoSportClass);

        System.out.println("!--------------------- End of sequence demo ---------------------!");
    }
}