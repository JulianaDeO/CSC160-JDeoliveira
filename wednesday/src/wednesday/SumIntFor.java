package wednesday;

import java.util.Scanner;
//print all the sum of all integers up to the number.

public class SumIntFor {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Type a number: ");
		int number = input.nextInt();
		
		int sum=0;
		int i=1;

		for(i=1; i <= number ; i++)
		{sum=sum+i;}

		System.out.println(sum);
	}

}
