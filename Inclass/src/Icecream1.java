import java.util.Scanner;

public class Icecream1 {

	public static void main(String[] args) {
		int singlecone = 5;
		int doublecone = 7;
		int sprinkles = 1;
		double cost = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.println(" Did you get a ice cream?");
		String answer= input.next();
		
		if (answer.equals("yes")){
			 cost = singlecone;
		} else  {
			cost = 0;
		}
		
		System.out.println("The cost is : 7.");
		
		
		
		}

	}


