import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int number1;
		int number2;
		int number3;
		
		System.out.println("Type number 1:");
		number1 = input.nextInt();
		System.out.println("Type number 2: ");
		number2 = input.nextInt();
		System.out.println("Type number 3: ");
		number3 = input.nextInt();
		
		int myNum = greatestNumber(number1, number2, number3);
		System.out.println("The greatest number is: " + myNum);
		
		input.close();

	}

	public static int greatestNumber(int one, int two, int three) {
		if (one >= two && one >= three ) {
			return one;
		} else if (two >= one && two >= three) {
			return two;
		} else if(three>= one && three>= two) {
			return three; 
		} else {
			return one;
		}
	}
}

