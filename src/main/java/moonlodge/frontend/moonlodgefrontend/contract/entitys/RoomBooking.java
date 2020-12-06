package moonlodge.frontend.moonlodgefrontend.contract.entitys;

import java.io.Serializable;

public class RoomBooking implements Serializable {
    private long id;
    private long dateofArrival, dateOfDeparture;
    private Room room;
    private Booking booking;

    public RoomBooking(long dateofArrival, long dateOfDeparture, Room room, Booking booking) {
        this.dateofArrival = dateofArrival;
        this.dateOfDeparture = dateOfDeparture;
        this.room = room;
        this.booking = booking;
    }

    public RoomBooking() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getDateofArrival() {
        return dateofArrival;
    }

    public void setDateofArrival(long dateofArrival) {
        this.dateofArrival = dateofArrival;
    }

    public long getDateOfDeparture() {
        return dateOfDeparture;
    }

    public void setDateOfDeparture(long dateOfDeparture) {
        this.dateOfDeparture = dateOfDeparture;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    @Override
    public String toString() {
        return "RoomBooking{" +
                "id=" + id +
                ", dateofArrival=" + dateofArrival +
                ", dateOfDeparture=" + dateOfDeparture +
                ", room=" + room +
                ", booking=" + booking +
                '}';
    }
}
