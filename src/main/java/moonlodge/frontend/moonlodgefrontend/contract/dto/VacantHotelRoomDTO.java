package moonlodge.frontend.moonlodgefrontend.contract.dto;


import moonlodge.frontend.moonlodgefrontend.contract.entitys.RoomType;

import java.io.Serializable;

public class VacantHotelRoomDTO implements Serializable {

    private long id;
    private RoomType roomType;
    private int maxCapacity;
    private double price;
    private HotelDTO hotel;

    public VacantHotelRoomDTO(long id, RoomType roomType, int maxCapacity, double price, HotelDTO hotel) {
        this.id = id;
        this.roomType = roomType;
        this.maxCapacity = maxCapacity;
        this.price = price;
        this.hotel = hotel;
    }

    public VacantHotelRoomDTO() {
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

    public HotelDTO getHotel() {
        return hotel;
    }

    public void setHotel(HotelDTO hotel) {
        this.hotel = hotel;
    }

    @Override
    public String toString() {
        return "VacantHotelRoomDTO{" +
                "id=" + id +
                ", roomType=" + roomType +
                ", maxCapacity=" + maxCapacity +
                ", price=" + price +
                ", hotel=" + hotel +
                '}';
    }
}
