public class TemperatureConverter {
	public static double convertToFahrenheat(double celsius) {
		return (celsius*9/5+32);
	}
   public static void main(String args) {
	   double getdouble=convertToFahrenheat(25);
	   System.out.println(TemperatureConverter.convertToFahrenheat(25));
   }
}
