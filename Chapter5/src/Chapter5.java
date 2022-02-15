import java.util.Scanner;

public class Chapter5 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int number1;
		
		System.out.println("Type a number");
		number1 = input.nextInt();
		 System.out.println("this is the number :" + number1);
		 
		 boolean result = isPositive (number1);
		 if (result) {
			 System.out.println("The number is positive");			 
		 } else {
			System.out.println("The number is negative");
			 
		 }
		 
		 input.close();
	}
	
	public static boolean isPositive(int number) {
		if (number >= 0) {
			return true;
		}else {
			return false;
		}
	
		
	}
	
	
	
}