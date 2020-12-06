package moonlodge.frontend.moonlodgefrontend.contract.entitys;


import java.io.Serializable;
import java.util.Collection;

public class HeadQuarter implements Serializable {
    private long id;
    private String countryCode;
    private Collection<Hotel> hotels;

    public HeadQuarter(String countryCode) {
        this.countryCode = countryCode;
    }

    public HeadQuarter() {
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public Collection<Hotel> getHotels() {
        return hotels;
    }

    public void setHotels(Collection<Hotel> hotels) {
        this.hotels = hotels;
    }
    public void addHotel(Hotel hotel) {
        this.hotels.add(hotel);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "HeadQuarter{" +
                "id=" + id +
                ", countryCode='" + countryCode + '\'' +
                ", hotels=" + hotels +
                '}';
    }
}
