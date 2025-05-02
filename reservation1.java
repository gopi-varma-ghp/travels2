public class Reservation {
	public void getReservationDetails(String hotelName, String questName,int nights) {
		    
		        System.out.println(" hotel name is"+  name);
		        System.out.println("questname  is " +  quest);
		        System.out.println(" nights is " +  nights);
		    }

		    public static void main(String[] args) {
		        Reservation f2 =  new Reservation();
		        f2.   getReservationDetails("grand palace", "david"," 2");
		        f2.  getReservationDetails(" grand palace", "maria", "3");
		    }
		}
