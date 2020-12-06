package moonlodge.frontend.moonlodgefrontend.contract.dto;

import moonlodge.frontend.moonlodgefrontend.contract.entitys.Hotel;

import java.io.Serializable;
import java.util.List;

public class BookingDTO implements Serializable {
    private long bookingID;
    private List<RoomDTO> rooms;
    private String passportNumber;
    private Hotel hotel;

    public BookingDTO() {
    }

    public BookingDTO(long id, List<RoomDTO> rooms, String passportNumber, Hotel hotel) {
        this.bookingID = id;
        this.rooms = rooms;
        this.passportNumber = passportNumber;
        this.hotel = hotel;
    }

    public List<RoomDTO> getRooms() {
        return rooms;
    }

    public void setRooms(List<RoomDTO> rooms) {
        this.rooms = rooms;
    }

    public long getId() {
        return bookingID;
    }

    public void setId(long id) {
        this.bookingID = id;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumbers) {
        this.passportNumber = passportNumber;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    @Override
    public String toString() {
        return "BookingDTO{" +
                "bookingID=" + bookingID +
                ", rooms=" + rooms +
                ", passportNumber=" + passportNumber +
                ", hotel=" + hotel +
                '}';
    }
}
