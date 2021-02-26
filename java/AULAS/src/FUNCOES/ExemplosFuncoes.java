package FUNCOES;

import java.util.Scanner;

public class ExemplosFuncoes {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int numero;
		
		System.out.println("Digite um n�mero inteiro positivo: ");
		numero = leia.nextInt();
		
		pula();
		System.out.println("---------------");
		
		parImpar(numero);
		
		pula();
		System.out.println("---------------");
		
		leia.close();
	}
	
	public static void pula() {
		System.out.println();
	}
	
	public static void parImpar (int numero) {
		
		if (numero % 2 == 0) {
			System.out.printf("O n�mero % d � PAR!", numero);
		}
		
		else if (numero % 2 != 0) {
			System.out.printf("O n�mero %d � �MPAR!", numero);
		}
	}

}
