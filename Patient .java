public class Patient {
		public void printDetails(String hospitalName, String patientName, int age) {
		       System.out.println("hospital name is"+ hospitalName);
		       System.out.println("patient name is"+  hospitalName );
		       System.out.println("patient age is"+ age);
			}
			public static void main(String args[]) {
			Patient f2=new Patient();
				f2.printDetails( " city care hospital","john doe",45);
				f2.printDetails("city care hospital","emma watson",30);
			}
		       
		}


