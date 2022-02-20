import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {

		double number;
		Scanner input = new Scanner(System.in);

		System.out.println("Type a number");
		number = input.nextDouble();
		input.close();

		if (number > 0) {
			if (number < 1) {
				System.out.println(" The number " + number + ", is a small positive number.");

			} else if (number > 1000000) {
				System.out.println("The number  " + number + "is a positive large number.");

			} else {
				System.out.println("The number " + number + ",is a positive number.");

			}
		} else if (number < 0) {
			if (Math.abs(number) < 1) {
				System.out.println("the number " + number + ", is  a small negative number.");

			} else if (Math.abs(number) > 1000000) {
				System.out.println("the number " + number + ",is a large negative number.");

			} else {
				System.out.println("The number  " + number + ",is a large negative number.");

			}
		} else

		{
			System.out.println("zero.");

		}
	}

}
