package week5;

import java.util.Scanner;

public class SumOfForNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Tpe a number: ");
		int number = input.nextInt();
		
		int sum=0;

		int i=0;

		for(i=1; i <= number ; i++)
		{sum=sum+i;}

		System.out.println(sum); // here the ‘sum’ variable will give the sum 
	}

}
