import java.util.Scanner;
public class Exercise4 {

	public static void main(String[] args) {
	
				int number;
				Scanner input = new Scanner (System.in);
				System.out.println("Type a number between 1 and 7");
				number= input.nextInt();
				input.close();
				System.out.println(getWeekDay(number));
			}
				//add break, if not the output it is just the same.
			//dname = day name.
				public static String getWeekDay(int day) {
					String dname = "";
					switch (day){
					case 1: dname = "sunday";break;
					case 2: dname = "monday";break;
					case 3: dname = "tuesday";break;
					case 4: dname = "wednesday";break;
					case 5: dname = "thrusday";break;
					case 6: dname = "friday";break;
					case 7: dname = "saturday";break;
					}
					return dname;
					
				
			}

				


	}

