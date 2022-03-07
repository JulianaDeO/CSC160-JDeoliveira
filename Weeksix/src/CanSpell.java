import java.util.Arrays;

public class CanSpell {

	public static void main(String[] args) {
		/*
		 * Write a method called canSpell that takes two strings and checks whether the
		 * set of tiles can spell the word. You might have more than one tile with the
		 * same letter, but you can use each tile only once
		 */
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

	
		
		
		
		
		
	
