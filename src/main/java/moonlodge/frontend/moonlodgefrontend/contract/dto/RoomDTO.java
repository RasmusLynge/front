package moonlodge.frontend.moonlodgefrontend.contract.dto;

import java.io.Serializable;

public class RoomDTO implements Serializable  {
    private long dateofArrival, dateofDeparture;
    private long roomID;
    private String type;
    private double price;
    private int maxCapacity;

    public RoomDTO() {
    }

    public RoomDTO(long dateofArrival, long dateofDeparture, long id, String type, double price, int maxCapacity) {
        this.dateofArrival = dateofArrival;
        this.dateofDeparture = dateofDeparture;
        this.roomID = id;
        this.type = type;
        this.price = price;
        this.maxCapacity = maxCapacity;
    }

    public long getRoomID() {
        return roomID;
    }

    public long getDateofArrival() {
        return dateofArrival;
    }

    public void setDateofArrival(long dateofArrival) {
        this.dateofArrival = dateofArrival;
    }

    public long getDateofDeparture() {
        return dateofDeparture;
    }

    public void setDateofDeparture(long dateofDeparture) {
        this.dateofDeparture = dateofDeparture;
    }

    public long getId() {
        return roomID;
    }

    public void setId(long id) {
        this.roomID = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    @Override
    public String toString() {
        return "RoomDTO{" +
                "dateofArrival=" + dateofArrival +
                ", dateofDeparture=" + dateofDeparture +
                ", roomID=" + roomID +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", maxCapacity=" + maxCapacity +
                '}';
    }
}
