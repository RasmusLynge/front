package moonlodge.frontend.moonlodgefrontend.contract.entitys;


import java.io.Serializable;
import java.util.List;

public class Guest implements Serializable {
    private long id;
    private String passportNumber;
    private List<Booking> bookings;

    public Guest(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public Guest() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }

    public void addBooking(Booking booking) {
        this.bookings.add(booking);
    }

    @Override
    public String toString() {
        return "Guest{" +
                "id=" + id +
                ", passportNumber='" + passportNumber + '\'' +
                ", bookings=" + bookings +
                '}';
    }
}
