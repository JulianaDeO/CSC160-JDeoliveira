import java.util.Scanner;

public class RightAngleLoop {

	/*
	 * Write a program (class name RightAngleLoop) to accept a number from the user
	 * and display the pattern like right angle triangle with a number like the
	 * picture shown here. You should define and invoke a method called
	 * getUserNumber() to get the number from the user.
	 */

	public static void main(String[] args) {
		int a = getUserNumber("");
		// System.out.println(a);
		int num = 1;
		for (int row = 1; row <= a; row++) {
			for (int j = 1; j <= row; j++) {
				System.out.format("%-5d", num++);
			}
			System.out.println("");
		}
	}

	public static int getUserNumber(String num1) {

		Scanner input = new Scanner(System.in);
		int number_rows;
		System.out.println("Type a number : ");
		number_rows = input.nextInt();
		input.close();

		return number_rows;

	}
}