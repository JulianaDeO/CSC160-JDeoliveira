import java.util.Scanner;

public class Tempconverter {

	public static void main (String[] args) {
		Scanner userinput= new Scanner(System.in);
		
	
		
		double fahrenheit =  celsius * ( 9/5)+32;
		double celsius = (fahrenheit -32)*5/9;
		
		System.out.println("Digite a temperatura em Celsius");
		celsius = userinput.nextDouble();
		
		System.out.println("Digite a temperatura em Fahrenheit");
		fahrenheit = userinput.nextDouble();
		
		System.out.println("A temperatura em celsius e :" + fahrenheit);
		System.out.println("A temperatura em Fahrenheit e :" + celsius);
		userinput.close();
	
		
		
	}

}
