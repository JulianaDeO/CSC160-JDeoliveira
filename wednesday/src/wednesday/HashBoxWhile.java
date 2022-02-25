package wednesday;

import java.util.Scanner;

public class HashBoxWhile {

	public static void main(String[] args) {
		int n;
		int i = 1, j, k;
		Scanner input = new Scanner(System.in);
		System.out.println("Type the number of rows");// simbolos deitadosdeitada
		n = input.nextInt();
		while (i <= n) {
			k = 1;
			while (k <= (i - 1)) {
				System.out.print("*");// essa aqui e important.
				k++;// se eu quero so um lado do triangulo essa aqui faz o servico.
			}
			j = i;
			while (j <= n){// se eu quero numeros eu coloco so o j, se e simbolos eu coloco o simbolo.entre aspas 
				System.out.print(j);// essa e responsavel por completar  a caixa.
				j++;
			}
			System.out.println("");// responsavel por parar o programa
			i++;
		}
}
}