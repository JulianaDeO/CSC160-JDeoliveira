import java.util.Scanner;

public class WhileFibonacci {

	public static void main(String[] args) {
		int N, i = 0, FirstN = 0, SecondN = 1, NextV;
		Scanner sc = new Scanner(System.in);
		System.out.println("Fibonacci sequence");
		System.out.println("Give n a value: ");
		N = sc.nextInt();
		sc.close();

		while (i < N) {
			if (i <= 1) {
				NextV = i;
			} else {
				NextV = FirstN + SecondN;
				FirstN = SecondN;
				SecondN = NextV;
			}
			System.out.println(NextV);
			i++;

		}
	}
}
