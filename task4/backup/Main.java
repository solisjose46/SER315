import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

package task4;

public class Main {
    public static final int TRAINER_RESERVATION_MAX = 15;
    public static final int CLASS_CAPACITY_MAX = 6;
    // Assuming 9 hour day 0800 - 1700
    public static final int ROOM_RESERVATION_MAX = 9;
    
    public static void main(String[] args) {
        Room room1 = new Room(RoomNames.Room1);
        Customer bob = new Customer("Bob", "bob", "bob", "123456789");
        Customer alice = new Customer("Alice", "alice", "alice", "123456789");
        Owner owner = new Owner("Owner", "owner", "owner", "123456789");
        // starting at 1000 utc tomorrow ends at 1100 utc tomorrow
        Date startDate = new Date(System.currentTimeMillis() + 86400000 + 36000000);
        Date endDate = new Date(System.currentTimeMillis() + 86400000 + 36000000 + 3600000);
        RoomReservation roomReservation = new RoomReservation(startTime, endTime room1, trainer1);
        room1.roomReservations[0] = roomReservation;
        int classIDJudo = new Random().nextInt(1000);
        SportClass JudoAt9 = new SportClass(Sports.Judo, false, classIDJudo, CLASS_CAPACITY_MAX, roomReservation, owner);
        JudoAt9.customers[0] = bob;
        JudoAt9.customers[1] = alice;

        Room room5 = new Room(RoomNames.Room5);
        Customer john = new Customer("John", "john", "john", "123456789");
        Trainer trainer1 = new Trainer("Trainer1", "trainer1", "trainer1", "123456789");
        // starting at 1000 utc tomorrow ends at 1100 utc tomorrow
        Date date2 = new Date(System.currentTimeMillis() + 86400000 + 36000000);
        Date date3 = new Date(System.currentTimeMillis() + 86400000 + 36000000 + 3600000);
        RoomReservation roomReservation2 = new RoomReservation(date2, date3, room5, trainer1);
        room5.roomReservations[0] = roomReservation2;
        int classIDBoxing = new Random().nextInt(1000);
        SportClass BoxingAt10 = new SportClass(Sports.Boxing, true, classIDBoxing, CLASS_CAPACITY_MAX, roomReservation, trainer1);
        BoxingAt10.customers[0] = john;
    }
}