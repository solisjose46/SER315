import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

package task4;

public class SportClass {
    public Sports sport;
    public boolean isPrivate;
    public int classID;
    public Trainer trainer;
    public Customer[] customers;
    public RoomReservation roomReservation;

    SportClass(Sports sport, boolean isPrivae, int classID, int classCapacity, RoomReservation roomReservation, Trainer trainer) {
        this.customers = new Customer[classCapacity];
        this.sport = sport;
        this.isPrivate = isPrivate;
        this.classID = classID;
        this.roomReservation = roomReservation;
        this.trainer = trainer;
    }
}
