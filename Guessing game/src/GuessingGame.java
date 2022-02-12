import java.util.Scanner;
import java.util.Random;

public class GuessingGame {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int number1, number2;
		Random random = new Random();
		number1 = random.nextInt(100) + 1;

		System.out.println("I'm thinking of a number between 1 and 100");
		System.out.println("Can you guess which one it is?");
		System.out.println("Type a number:");
		number2 = input.nextInt();
		System.out.println("Your guess is :" + number2);
		System.out.println("The number that I was thinking of is :" + number1);
		System.out.println("You were off by: " + Math.abs(number1 - number2));

		input.close();

	}

}


	


