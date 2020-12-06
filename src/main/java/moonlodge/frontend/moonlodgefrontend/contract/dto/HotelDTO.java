package moonlodge.frontend.moonlodgefrontend.contract.dto;

import java.io.Serializable;

public class HotelDTO implements Serializable {
    private String name, address, city;
    private double rating, distanceToCenter;
    private String id;
    private long headQuarterId;


    public HotelDTO( String id, String name, String address, String city, double rating, double distanceToCenter, long headQuarterId) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.rating = rating;
        this.distanceToCenter = distanceToCenter;
        this.id = id;
        this.headQuarterId = headQuarterId;
    }

    public HotelDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getDistanceToCenter() {
        return distanceToCenter;
    }

    public void setDistanceToCenter(double distanceToCenter) {
        this.distanceToCenter = distanceToCenter;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getHeadQuarterId() {
        return headQuarterId;
    }

    public void setHeadQuarterId(long headQuarterId) {
        this.headQuarterId = headQuarterId;
    }

    @Override
    public String toString() {
        return "HotelDTO{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", rating=" + rating +
                ", distanceToCenter=" + distanceToCenter +
                ", id=" + id +
                ", headQuarterId=" + headQuarterId +
                '}';
    }
}
