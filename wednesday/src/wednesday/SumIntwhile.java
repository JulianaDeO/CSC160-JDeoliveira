package wednesday;

import java.util.Scanner;

public class SumIntwhile {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
		
		System.out.println("Type a number: ");
		int number = input.nextInt();
		
		int n = 1;
		int sum = 0;
		while (n <= number) {
			System.out.println(n);
			sum = sum + n;
			n = n + 1;
		}
		System.out.println("Total : " + sum);

	}
	
	}


