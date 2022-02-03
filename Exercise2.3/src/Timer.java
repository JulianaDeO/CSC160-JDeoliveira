
public class Timer {
	public static void main(String[] args) {
		int hour = 7;
		int minute = 30;
		int seconds = 45;
		double day= 86400; //the amount of seconds in a day.
		System.out.print("The current time is ");
		System.out.print(hour);
		System.out.print(":");
		System.out.print(minute);
		System.out.print(":");
		System.out.println(seconds);

		
		System.out.print("Number of seconds since midnight: ");
		System.out.println(hour * 3600 + minute * 60 + seconds);

		
		System.out.print("number of seconds remaining in the day: ");
		System.out.println(day - ((hour * 3600) + (30 *60) + 45));

		
		System.out.print("The percentage of the day that has passed: ");
		System.out.println(((hour*3600 + minute*60 + seconds)/day)*100);
	}
		
}
