import java.util.Scanner;

public class SecondQuetsion {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int drinks;
		System.out.println("What kind of beverage do you want?");
		drinks = input.nextInt();
		input.close();

		if (drinks == 1) {

			System.out.println("water");

		} else if (drinks == 2) {

			System.out.print("Coke");

		} else if (drinks == 3) {
			System.out.println("Coffee");
		}
	}

}

