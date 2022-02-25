import java.util.Scanner;

public class ThirdQuestion {

	public static void main(String[] args) {
		int result = makes10(6, 7);
		int a = 0;
		int b = 0;// main has to print if it is up or less.
		if (result <= 10) {
			System.out.println(result + " , The numbers did not sum up to 10.");
		} else if (result > 10) {
			System.out.println(result + " , The numbers sum up to 10.");
		}
	}

	public static int makes10(int num1, int num2) {

		Scanner input = new Scanner(System.in);
		System.out.println("Type the frist number.");
		num1 = input.nextInt();
		System.out.println("Type the second number");
		num2 = input.nextInt();
		input.close();
		return num1 + num2;// it has to be returned to main.

	}
}