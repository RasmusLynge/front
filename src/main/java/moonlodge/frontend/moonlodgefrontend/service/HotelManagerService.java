package moonlodge.frontend.moonlodgefrontend.service;

import moonlodge.frontend.moonlodgefrontend.contract.dto.BookingDTO;
import moonlodge.frontend.moonlodgefrontend.contract.dto.VacantHotelRoomDTO;
import moonlodge.frontend.moonlodgefrontend.contract.entitys.Room;
import moonlodge.frontend.moonlodgefrontend.contract.interfaces.HotelManagerInterface;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.rmi.RemoteException;
import java.sql.Date;
import java.util.List;




@Component
public class HotelManagerService {



    @Resource
    @Qualifier("rmiProxy")
    private HotelManagerInterface rmiProxy;


    public List<VacantHotelRoomDTO> getHotelRoomList(String city, long dateFrom, long dateTo, int numberGuests, int numberRooms) throws RemoteException {
        return this.rmiProxy.getHotelRoomList(city, dateFrom, dateTo,  numberGuests, numberRooms);
    }


    public BookingDTO createBooking(List<Room> rooms, String passportNumber, long dateFrom, long dateTo, boolean arrivalIsLate) throws RemoteException {
        return this.rmiProxy.createBooking(rooms, passportNumber, dateFrom, dateTo, arrivalIsLate);
    }


    public List<BookingDTO> findBookings(String passportNumber) throws RemoteException {
        return this.rmiProxy.findBookings(passportNumber);
    }


    public boolean cancelBooking(long bookingId) throws RemoteException {
        return this.rmiProxy.cancelBooking(bookingId);
    }


}

