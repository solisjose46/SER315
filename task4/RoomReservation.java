import java.lang.Integer;
import java.util.ArrayList;
import java.time.Duration;
import java.time.LocalDateTime;
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
}