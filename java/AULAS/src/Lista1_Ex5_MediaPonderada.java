import java.util.Scanner;

public class Lista1_Ex5_MediaPonderada {
	public static void main(String args []) {
		
		Scanner ler = new Scanner (System.in);
			int pesoPrimeira = 2, pesoSegunda = 3, pesoTerceira = 5;
			double primeiraNota, segundaNota, terceiraNota, mediaPonderada;

				System.out.println("Primeira Nota:");
					primeiraNota = ler.nextInt();
		
				System.out.println("Segunda Nota:");
					segundaNota = ler.nextInt();
		
				System.out.println("Terceira Nota:");
					terceiraNota = ler.nextInt();
					
						mediaPonderada = ((primeiraNota * pesoPrimeira) + (segundaNota * pesoSegunda) + (terceiraNota * pesoTerceira)) / (pesoPrimeira + pesoSegunda + pesoTerceira);

				System.out.println("Sua m�dia ponderada �: " + mediaPonderada);
					
	}
}
