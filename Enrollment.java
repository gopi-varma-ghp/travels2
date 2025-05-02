public class Enrollment {
	public void getEnrollment(String platform, String course,String name) {
		    
		        System.out.println(" Enrollmentplat form is"+  platform);
		        System.out.println("Enrollment course is " +  course );
		        System.out.println(" Enrollment name is " +  name);
		    }

		    public static void main(String[] args) {
		        Enrollment f2 = new Enrollment();
		        f2. getEnrollment("udemy", "java programming"," alice");
		        f2.getEnrollment("udemy", "python", "Bab");
		    }
		}
