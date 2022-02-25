import java.util.Scanner;

//import java.util.Scanner;

public class PrintTwice {
public static void main (String []args) {
	//Scanner input = new Scanner(System.in);
	welcome();
	multiplay (5,8);
	multiplay (7,9);
	maintence(9,8);
	divide(5,5);
}
 public static void multiplay(int a, int b) {
	 System.out.println(a*b);
 }
 public static void welcome () {
	 System.out.println("Welcome to java!");
 }
 public static void maintence (int ax, int az) {
	 Scanner input = new Scanner(System.in);
System.out.println("Type a number");
ax =input.nextInt();
System.out.println(ax);

}
 public static void divide(int a, int b) {
	 System.out.println(a/b);
}
}