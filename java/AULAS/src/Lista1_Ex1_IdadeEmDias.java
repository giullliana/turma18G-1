import java.util.Scanner;

public class Lista1_Ex1_IdadeEmDias {
	public static void main(String args []) {
		
		Scanner ler = new Scanner (System.in);
		int diaNascimento, mesNascimento, anoNascimento, diasTotais;
		
			System.out.println("Insira o dia em que voc� nasceu: ");
				diaNascimento = ler.nextInt();
			
			System.out.println("Insira o m�s em que voc� nasceu: ");
				mesNascimento = ler.nextInt();
			
			System.out.println("Insira o ano em que voc� nasceu: ");
				anoNascimento = ler.nextInt();
				
			diasTotais = (anoNascimento * 365)+(mesNascimento * 30) + diaNascimento;
			
			System.out.println("Sua idade em dias �: " + diasTotais);
	}
}
