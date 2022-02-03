
public class Timer {
	public static void main(String[] args) {

		int hour = 8;
		int minute = 30;
		int seconds = 45;
		double total = seconds / 86400;
		System.out.print("The current time is ");
		System.out.printf("%2d", hour);
		System.out.print(":");
		System.out.print(minute);
		System.out.print(":");
		System.out.println(seconds);

		
		System.out.print("Number of seconds since midnight: ");
		System.out.println(hour * 3600 + minute * 60 + seconds);

		hour = 16 * 60;
		minute = 29 * 60;
		seconds = 15;
		System.out.print("number of seconds remaining in the day: ");
		System.out.println(hour * 60 + minute + seconds);

		hour = 7 * 60;
		minute = hour + 30;
		seconds = (minute * 60) + 45;
		total = (double) seconds / 86400;
		System.out.print("The percentage of the day that has passed: ");
		System.out.println(total * 100);
	}
}
