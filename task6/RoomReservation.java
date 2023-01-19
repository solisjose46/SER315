import java.lang.Integer;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

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

    public String printRoomReservation() {
        String date = this.time.toString();
        String reservationCount = this.printReservationCount();

        return "Room: " + this.room.roomName + " Date: " + date + " Trainer: " + this.trainer.name + " Duration: " + reservationCount + " hours.";
    }

    public Integer getReservationCount() {
        return this.reservationCount;
    }

    public String printReservationCount() {
        return this.reservationCount.toString();
    }

}