import java.lang.Integer;
import java.util.ArrayList;
import java.time.Duration;
import java.time.Month;
import java.util.Random;

public class RoomReservation {
    public LocalDateTime startTime;
    public LocalDateTime endTime;
    public Room room;
    public Trainer trainer;
    public Integer reservationCount;

    RoomReservation(LocalDateTime startTime, LocalDateTime endTime, Room room, Trainer trainer) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.room = room;
        this.trainer = trainer;
        this.reservationCount = (int) Duration.between(startTime, endTime).toHours();
    }

    public String printRoomReservation() {
        String date = this.startTime.toString();
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