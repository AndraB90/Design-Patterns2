package facade.exercitiu2;

public class TravelFacade {

    HotelBooker hotelBooker;
    FlightBooker flightBooker;

    public TravelFacade(){
        hotelBooker = new HotelBooker();
        flightBooker = new FlightBooker();
    }

    public void getVacation(){
        hotelBooker.searchHotel();
        hotelBooker.reserveRoom();
        flightBooker.searchFlight();
        flightBooker.bookFlight();
    }
}
