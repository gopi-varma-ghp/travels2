public class Faculity {
	
		public void showfaculityDetails(String universityName, String faculityName, String department) {
		       System.out.println("university name is"+ universityName);
		       System.out.println("faculity name is"+  faculityName );
		       System.out.println("department name is"+ department);
			}
			public static void main(String args[]) {
			Faculity f2=new Faculity();
				f2.showfaculityDetails( " mallareddy university","brown"," computer science");
				f2.showfaculityDetails("Standford university","green","physics");
			}
		       
		}



