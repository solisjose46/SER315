import java.lang.Integer;
import java.util.ArrayList;
import java.time.LocalDateTime;
import java.util.Random;

public class Room {
    public RoomReservation[] roomReservations = new RoomReservation[Main.ROOM_RESERVATION_MAX];
    public RoomNames roomName;

    Room(RoomNames roomName) {
        this.roomName = roomName;
    }
}