import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {

		int number;
		Scanner input = new Scanner(System.in);
		System.out.println("Tipe a number:");
		number = input.nextInt();
		input.close();
		String result = isPositive(number);
		System.out.println(result);

	}

	public static String isPositive(int num1) {
		if (num1 > 0) {
			return "number: " + num1 + " Is positive.";
		}

		else if (num1 < 0)

		{
			return "number: " + num1 + " Is negative.";

		} else {
			return "number: " + num1 + " Is zero.";
		}
	}
}