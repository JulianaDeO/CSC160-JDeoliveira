import java.util.Scanner;

public class FifthQuestion {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Type a number.\n If you type 0, the program stops");

		int sum = 0;
		while (true) {// This part I din't study, while + true and if together.
			int num1 = input.nextInt();
			if (num1 == 0)
				break;
			sum += num1;

		}
		System.out.println("The sum is: " + sum);
	}

}
