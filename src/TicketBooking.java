public class TicketBooking extends TicketCounter implements Runnable{
    TicketCounter ticketCounter;
  String passengerName;
   int noOfSeatsToBook;

    public TicketBooking(TicketCounter ticketCounter, String passengerName, int noOfSeatsToBook)  {
        this.ticketCounter = ticketCounter;
        this.passengerName = passengerName;
        this.noOfSeatsToBook = noOfSeatsToBook;

    }

    @Override
    public void run() {

        System.out.println("Name is "+passengerName);
        System.out.println("Seat Available is "+ticketCounter.availableSeats);
//        if(ticketCounter.availableSeats-noOfSeatsToBook>0) {
//            System.out.println("Seat Booked is " + noOfSeatsToBook);
//        }

        try {
            ticketCounter.bookSeat(passengerName,noOfSeatsToBook);
        } catch (NoSeatAvailableException e) {
             new NoSeatAvailableException("Not available");
        }


    }
}
