import java.util.Scanner;

public class Icecream3 {

	public static void main(String[] args) {
		int singlecone = 5;
		int doublecone = 7;
		int sprinkles = 1;
		double cost = 0.0;
		
		Scanner input = new Scanner(System.in);
		System.out.println(" How many ice creams do you want?");
		int numStudents= input.nextInt();
		input.nextLine();
		for (int num=0; num< numStudents; num++   ) {
			
			System.out.println(" Do u want a double scoop?");	
			String twoORone = input.nextLine();
			if (twoORone.equals("yes")) {
				cost = cost + doublecone;
			}else { 
				cost = cost+ singlecone;
			}
			
	}
		System.out.println(cost);
}
	
}