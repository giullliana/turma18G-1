import java.util.Scanner;

public class Lista1_Ex3_EventoFabrica {
	public static void main(String args []) {
		
		Scanner ler = new Scanner (System.in);
			int tempoDuracao, horas, minutos, segundos;

				System.out.println("Digite o tempo de dura��o em segundos:");
					tempoDuracao = ler.nextInt();
					horas = tempoDuracao / 3600;
					minutos = (tempoDuracao % 3600) / 60;
					segundos = (tempoDuracao % 3600) % 60;
					
				System.out.println("Dura��o do evento: "+ horas+" horas, "+ minutos+ " minutos, e "+ segundos+ " segundos");
		
	}
}
