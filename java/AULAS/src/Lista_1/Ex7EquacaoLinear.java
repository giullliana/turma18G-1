package Lista_1;

import java.util.Scanner;

public class Ex7EquacaoLinear {
	public static void main(String args[]) {

		Scanner ler = new Scanner(System.in);
		int coeficienteA, coeficienteB, coeficienteC, coeficienteD, coeficienteE, coeficienteF, valorX, valorY;

		System.out.println("Coeficiente A:");
		coeficienteA = ler.nextInt();

		System.out.println("Coeficiente B:");
		coeficienteB = ler.nextInt();

		System.out.println("Coeficiente C:");
		coeficienteC = ler.nextInt();

		System.out.println("Coeficiente D:");
		coeficienteD = ler.nextInt();

		System.out.println("Coeficiente E:");
		coeficienteE = ler.nextInt();

		System.out.println("Coeficiente F:");
		coeficienteF = ler.nextInt();

		valorX = ((coeficienteC * coeficienteE) - (coeficienteB * coeficienteF))
				/ ((coeficienteA * coeficienteE) - (coeficienteB * coeficienteD));
		valorY = ((coeficienteA * coeficienteF) - (coeficienteC * coeficienteD))
				/ ((coeficienteA * coeficienteE) - (coeficienteB * coeficienteD));

		System.out.println("O valor de X � : " + valorX + " e o de Y: " + valorY);
	}
}