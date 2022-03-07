package week7;

import java.util.Arrays;

public class IsAnagrams {

	public static void main(String[] args) {
		// 1. step: se as duas strings não tem o mesmo tamanho, não é anagrama
		// 2.tranfroma em arrays para poder ordenar
		// 3.ordena para garantir a comparação simplificada
		// cria as novas strings baseadas nos arrays ordenados

		System.out.println(isAnagram("a", "b"));
	}

	public static boolean isAnagram(String word, String word1) {
		String a = "stop789";
		String b = "pots";

		if (a.length() != b.length()) {
			return false;
		}

		char[] c1 = a.toCharArray();
		char[] c2 = b.toCharArray();
		//
		Arrays.sort(c1);
		Arrays.sort(c2);

		String sc1 = new String(c1);
		String sc2 = new String(c2);
		return sc1.equals(sc2);
	}

}

