package wednesday;

import java.util.Scanner;

public class Formartriangulos {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		int number1; 
		int i;
		int j;
		System.out.println("Type the number of rows");// simbolos deitadosdeitada
		number1 = input.nextInt();
		
		for ( i=1; i<= number1;i=j+1 ) {//rows, corredores, essa parte e a de fora que sao os rows.
		 for ( j=0; j<i; j=j+1) {//colunas, em pe.
	
System.out.print("#");
}
		System.out.println();
}
		for( i=number1 - 1; i>0; i--) {
			for( j=0; j<i;j++){
				System.out.print("#");
			}
			System.out.println();
		}
	}

}
