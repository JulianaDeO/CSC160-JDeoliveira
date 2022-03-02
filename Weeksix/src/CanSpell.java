import java.util.Arrays;

public class CanSpell {

	public static void main(String[] args) {
		/*
		 * Write a method called canSpell that takes two strings and checks whether the
		 * set of tiles can spell the word. You might have more than one tile with the
		 * same letter, but you can use each tile only once
		 */

		// anagrama e formar novas palavras, aparti das palavras que ja temos.

		System.out.println(canSpell(" today", "dayto"));
		System.out.println(canSpell(" csillene", "sillence"));
		System.out.println(canSpell(" quijibo", "jib"));
	}

	public static boolean canSpell(String a, String b) {

		String word1 = a.replaceAll("\\s", "");
		String word2 = b.replaceAll("\\s", "");

		if (word1.length() != word2.length()) {
			return false;
		} else {

			char c1[] = word1.toLowerCase().toCharArray();
			char c2[] = word2.toLowerCase().toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			return Arrays.equals(c1, c2);
		}
	}

}	
		
		
		
		
		
	