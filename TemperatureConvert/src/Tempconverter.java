import java.util.Scanner;

public class Tempconverter {

	public static void main (String[] args) {
		
		
		int celsius ;
		int fahrenheit;
		Scanner userinput= new Scanner(System.in);
			
		
		System.out.println("Digite a temperatura em Celsius");
		celsius = userinput.nextInt();
		
		System.out.println("Digite a temperatura em Fahrenheit");
		fahrenheit = userinput.nextInt();
		
		fahrenheit =  (celsius * (9/5)+32);
		celsius = (5* (fahrenheit -32)/ 9);
		
		System.out.println("A temperatura em celsius e :" + fahrenheit);
		System.out.println("A temperatura em Fahrenheit e :" + celsius);
		userinput.close();
	
		
		
	}

}
