public class Ticket {
	public void  getTicketInfo(String theterName, String movieName,String seatNo) {
		    
		        System.out.println(" thetername is"+ theterName);
		        System.out.println("movie name is " + movieName );
		        System.out.println("seat num is " + seatNo);
		    }

		    public static void main(String[] args) {
		        Ticket f2 = new Ticket();
		        f2.getTicketInfo("sandhya", "arya"," A20");
		        f2.getTicketInfo("vishwanth", "bahubali", "c1");
		    }
		}
