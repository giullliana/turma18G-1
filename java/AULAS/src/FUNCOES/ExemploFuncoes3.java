package FUNCOES;

import java.util.Scanner;

public class ExemploFuncoes3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int numero;
		
		System.out.println("Digite um n�mero:");
		numero = leia.nextInt();
		
		System.out.printf("A ra�z quadrada do n�mero � %.2f", raiz(numero));
		
		leia.close();
	}
	
	public static double raiz (double numero) {
		return Math.sqrt(numero);
	}
}
