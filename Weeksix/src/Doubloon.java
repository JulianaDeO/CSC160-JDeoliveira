import java.util.Scanner;
//Write a method called isDoubloon that takes a string and checks whether it is
//a doubloon. To ignore case, invoke the toLowerCase method before checking

public class Doubloon {

	public static void main(String[] args) {

		if (isDoubloon("house")) {
			System.out.println("This is a doubloon");
		} else {
			System.err.println("This is not a doubloon");
		}
	}

	public static boolean isDoubloon(String s) {
		String l = s.toLowerCase();

		for (int i = 0; i < l.length(); i++) {
			int count = 0;
			for (int j = 0; j < l.length(); j++) {
				if (l.charAt(i) == l.charAt(j)) {
					count++;
					if (2 < count) {
						return false;
					}
				}
			}
			if (1 == count) {
				return false;
			}
		}
		return true;
	}

}

	
	