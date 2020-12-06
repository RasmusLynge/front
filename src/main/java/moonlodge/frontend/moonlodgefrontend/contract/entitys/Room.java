package moonlodge.frontend.moonlodgefrontend.contract.entitys;



import java.io.Serializable;
import java.util.List;

public class Room implements Serializable {

    private long id;
    private RoomType roomType;
    private int maxCapacity;
    private double price;
    private Hotel hotel;
    private List<RoomBooking> roomBooking;

    public Room(RoomType roomType, int maxCapacity, double price, Hotel hotel) {
        this.roomType = roomType;
        this.maxCapacity = maxCapacity;
        this.price = price;
        this.hotel = hotel;
    }

    public Room() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public List<RoomBooking> getRoomBooking() {
        return roomBooking;
    }

    public void setRoomBooking(List<RoomBooking> roomBooking) {
        this.roomBooking = roomBooking;
    }

    public void addRoomBooking(RoomBooking roomBooking) {
        this.roomBooking.add(roomBooking);
    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", roomType=" + roomType +
                ", maxCapacity=" + maxCapacity +
                ", price=" + price +
                ", hotel=" + hotel +
                ", roomBooking=" + roomBooking +
                '}';
    }
}
