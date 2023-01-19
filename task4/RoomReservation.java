import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

package task4;

public class RoomReservation {
    public Date startTime;
    public Date endTime;
    public Room room;
    public Trainer trainer;
    public Integer reservationCount;

    RoomReservation(Date startTime, Date endTime, Room room, Trainer trainer) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.room = room;
        this.trainer = trainer;
        this.reservationCount = (int) ((this.endTime.getTime() - this.startTime.getTime()) / 3600000);
    }
}