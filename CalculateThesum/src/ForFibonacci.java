import java.util.Scanner;

public class ForFibonacci {

	public static void main(String[] args) {
		/*
		 * Write a program to print Fibonacci series of n terms where n is input by
		 * user: 0 1 1 2 3 5 8 13 24 .....
		 * 
		 * a. Use a for loop (Call the class ForFibonacci)
		 * 
		 * b. Use a while loop (Call the class (WhileFibonacci)
		 */

		// 0,1,1,2,3,5,8

		Scanner input = new Scanner(System.in);

		System.out.println("Fibonacci sequence");// fibonacci always add the two last numbers.
		System.out.println("Give n a value");// n == how many numbers of fibonacci do I want it to show?
		int n = input.nextInt();
		input.close();

		int num1 = 0;
		int num2 = 1;
		System.out.println(num1);
		System.out.println(num2);

		int num3;
		for (int a = 0; a < n; a++) {
			num3 = num1;
			num1 = num2;
			num2 = num3 + num1;

			System.out.println(num2);

		}

	}

}
