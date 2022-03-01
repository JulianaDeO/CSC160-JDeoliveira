import java.util.Scanner;

public class Icecream2 {

	public static void main(String[] args) {
		int singlecone = 5;
		int doublecone = 7;
		int sprinkles = 1;
		double cost = 0.0;
		
		Scanner input = new Scanner(System.in);
		System.out.println(" How many ice creams do you wants?");
		int numStudents= input.nextInt();
		int num=0;
		
		while (num < numStudents) {
			cost = cost + singlecone;
			num++;
		}
		System.out.println("The tolat cost is :" + cost);
	}
}