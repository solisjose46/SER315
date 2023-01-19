import java.lang.Integer;
import java.util.ArrayList;
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

    public boolean isFull() {
        for (Customer customer : customers) {
            if (customer == null) {
                return false;
            }
        }
        return true;
    }

    public boolean isCustomerInClass(Customer customer) {
        for (Customer customerInClass : customers) {
            if(customerInClass != null) {
                if (customerInClass == customer) {
                    return true;
                }
            }
        }
        return false;
    }

    public int classDuration() {
        return this.roomReservation.getReservationCount();
    }

}