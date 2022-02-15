import java.util.Scanner;

public class TempConverter {
	
	

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter a value for the temperature to be converted");
		
		double input = scnr.nextDouble();
		
		
		double fahrenheit = celsius * 9/5+32.0;
		double celsius = fahrenheit-32 *5.0/9.0;
		System.out.print("the temperature in fahrenheit is :  " );
		System.out.print ("the temperature in celcius is :");
	

		
	}

}
