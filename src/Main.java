public class Main {
    public static void main(String[] args) throws NoSeatAvailableException {
        TicketCounter tc=new TicketCounter();
        TicketBooking t1= new TicketBooking(tc,"Abbas",1);
        TicketBooking t2= new TicketBooking(tc,"Jay",1);
        TicketBooking t3= new TicketBooking(tc,"Parth",2);

        t1.run();
//        tc.bookSeat("Abbas",1);
//        System.out.println(tc.availableSeats);
        t2.run();
        t3.run();


    }
}
