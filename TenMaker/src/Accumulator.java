import java.util.Scanner;

public class Accumulator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number1;
		System.out.println("Type a number?");
		number1 = input.nextInt();
		input.close();

		int n = 0;
		int sum = 0;
		while (n <= number1) {
			sum = sum + n;
			n = n + 1;
		}
		System.out.println("total " + sum);
	}

}
