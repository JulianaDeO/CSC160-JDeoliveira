package week7;
//prime are the numbers that are just divided por eles mesmo, e umtipo 5, 3,

import java.util.ArrayList;

public class Primefactors {// Write a method named arePrimeFactors that takes an integer
	// n and an array of integers, and that returns true if the numbers
	// in the array are all prime and their product is n.

	public static void main(String[] args) {

		System.out.println(arePrimeFactors(1, 10));

	}

	public static ArrayList<Integer> arePrimeFactors(int num, int num1) {
		ArrayList<Integer> pri = new ArrayList();

		for (int n = num; n < num1; n++) {

			boolean prime = true;

			int i = 2;

			while (i <= n / 2) {
				if (n % i == 0) {

					prime = false;
					break;

				}
				i++;
			}

			if (prime) {
				pri.add(n);
			}
		}
		return pri;
	}
}


