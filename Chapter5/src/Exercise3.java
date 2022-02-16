import java.util.Scanner;
public class Exercise3 {

	public static void main(String[] args) {
		
		 double number;
		  Scanner input = new Scanner(System.in);
		 
		 System.out.println("Type a number");
		 number = input.nextDouble();
		 input.close();
	
	if  (number > 0) {
	 if (number<1) { 
		 System.out.print(" The number " + number);
		 System.out.print(",");
	System.out.print( "is a small positive number. ");
	
	}else if (number > 1000000) {
		System.out.print("The number  " + number);
		System.out.print(",");
		System.out.print("is a positive large number.");
	}else {
		System.out.print("The number " +number );
		System.out.print(",");
		System.out.print("is positive number.");
	}
	} else if (number < 0 ) {
		if (Math.abs(number)<1) {
		System.out.print("the number " + number);
		System.out.print(",");
		System.out.print("is  a small negative number. ");
		
		}else if (Math.abs(number)>1000000)
		{
		System.out.print("the number "+ number);
		System.out.print(",");
		System.out.print("is a large negative number.");
	}else {
		System.out.print("The number  " + number);
		System.out.print(",");
		System.out.print("Is a negative number.");
	}
	}else
	
		{
		System.out.println("zero.");
			

			  }	  
	}

}
