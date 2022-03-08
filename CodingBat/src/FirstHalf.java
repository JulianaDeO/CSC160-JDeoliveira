public class FirstHalf {

	public static void main(String[] args) {
		//Given a string of even length, return the first half. So the string "WooHoo" yields "Woo"

		
		System.out.println(middleTwo("hoje"));
		
 
	}
	
	public static String middleTwo(String str) {
		
		str = str.substring(str.length()/2-1,str.length()/2+1);
		return str;
	}
}
