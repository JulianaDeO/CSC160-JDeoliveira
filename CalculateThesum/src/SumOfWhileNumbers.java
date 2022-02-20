
public class SumOfWhileNumbers {

	public static void main(String[] args) {
		int n = 1;
		int sum = 0;
		while (n <= 10) {
			System.out.println(n);
			sum = sum + n;
			n = n + 1;
		}
		System.out.println("Total : " + sum);

	}

}
