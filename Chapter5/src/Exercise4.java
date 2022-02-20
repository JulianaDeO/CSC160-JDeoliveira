import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {

		int number;
		Scanner input = new Scanner(System.in);
		System.out.println("Type a number between 1 and 7");
		number = input.nextInt();
		input.close();
		System.out.println(getWeekDay(number));
	}

	public static String getWeekDay(int day) {
		String dname = null;
		if (day == 1) {
			dname = "sunday";
		}
		if (day == 2) {
			dname = "monday";
		}
		if (day == 3) {
			dname = "tuesday";
		}
		if (day == 4) {
			dname = "wednesday";

		}
		if (day == 5) {
			dname = "thrusday";

		}
		if (day == 6) {
			dname = "friday";
		}
		if (day == 7) {
			dname = "saturday";
		}
		return dname;

	}

}
