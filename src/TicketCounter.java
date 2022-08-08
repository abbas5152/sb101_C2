public class TicketCounter {

   int  availableSeats = 3;
   public void bookSeat(String name, int numberOfSeats) throws NoSeatAvailableException {
      if(availableSeats-numberOfSeats>=0){
         availableSeats=availableSeats-numberOfSeats;
         if(availableSeats>0) {
            System.out.println(numberOfSeats + " seat is booked");
         }
      }
      else{
         NoSeatAvailableException nsa=new NoSeatAvailableException("sorry " +name+ " No seat Avaialble or Not Sufficient Seats");
      }


   }
}
