package Lista_1;

import java.util.Scanner;

public class Ex2DiasEmAnos {
	public static void main(String args[]) {

		Scanner ler = new Scanner(System.in);
		int diasVida, meses, anos, dias;

		System.out.println("Insira sua idade em dias: ");
		diasVida = ler.nextInt();

		anos = diasVida / 365;
		meses = (diasVida % 365) / 30;
		dias = (diasVida % 365) % 30;

		System.out.println("Voc� tem " + anos + " anos, " + meses + " meses, e " + dias + " dias de vida!");
	}
}
