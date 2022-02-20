import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {

		int number1, number2, number3;
		Scanner input = new Scanner(System.in);
		System.out.println("You will type three numbers: ");
		System.out.println("Type the frist number. ");
		number1 = input.nextInt();

		System.out.println("Type the second number. ");
		number2 = input.nextInt();
		System.out.println("Type the third number. ");
		number3 = input.nextInt();
		System.out.println("The three numbers are these ones: " + number1 + "," + number2 + "," + number3);
		input.close();
		String result = greatestNumber(number1, number2, number3);
		System.out.println(result);
	}

	public static String greatestNumber(int num1, int num2, int num3) {
		String cell = null;
		if (num1 >= num2 && num1 >= num3) {
			cell = "number " + num1 + " is the greatest.";
		} else if (num2 >= num1 && num2 >= num3) {
			cell = "number " + num2 + " is the greatest.";
		} else if (num3 >= num1 && num3 >= num2) {
			cell = "number " + num3 + " is the greatest.";

		}
		return cell;
	}
}

