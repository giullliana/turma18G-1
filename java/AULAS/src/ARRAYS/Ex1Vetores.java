package ARRAYS;

import java.util.Scanner;

public class Ex1Vetores {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int valores[] = new int[5], maiorValor = 0;

		for (int z = 0; z <= 4; z++) {
			System.out.printf("Digite o %d� valor:", z+1);
				valores[z] = leia.nextInt();
		}
		
		for (int z = 0; z <= 4; z++) {
			System.out.printf("%d� Valor: %d|", z+1, valores[z]);
			if (valores[z] > maiorValor) {
				maiorValor = valores[z];
			}
		}
		
		System.out.printf("Maior valor �: %d|", maiorValor);
		leia.close();
	}
}
