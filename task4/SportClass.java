import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class SportClass {
    public Sports sport;
    public boolean isPrivate;
    public int classID;
    public Trainer trainer;
    public Customer[] customers;
    public RoomReservation roomReservation;
    public int classCapacity;

    SportClass(Sports sport, boolean isPrivate, int classID, int classCapacity, RoomReservation roomReservation, Trainer trainer) {
        this.classCapacity = classCapacity;
        this.customers = new Customer[this.classCapacity];
        this.sport = sport;
        this.isPrivate = isPrivate;
        this.classID = classID;
        this.roomReservation = roomReservation;
        this.trainer = trainer;
    }
}
