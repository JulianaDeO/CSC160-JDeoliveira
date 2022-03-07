
public class Timer {
	public static void main(String[] args) {

		canSpell("h", "h");

	}

	public static String canSpell(String one, String two) {
		String word1 = "aniversario";
		String word2 = "ani";
		if (word1.indexOf(word2) != -1) {
			System.out.println("The string ,  " + word1 + "  contains, the word   " + word2);
		} else {
			System.out.println("the word doesn't contain the other word. ");
		}
		return null;
	}
}