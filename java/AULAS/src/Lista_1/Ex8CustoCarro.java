package Lista_1;

import java.util.Scanner;

public class Ex8CustoCarro {
	public static void main(String args[]) {

		Scanner ler = new Scanner(System.in);
		double custoFabrica, custoConsumidor, porcentagemDistribuidor, porcentagemImpostos;

		System.out.println("Valor de f�brica:");
		custoFabrica = ler.nextInt();

		porcentagemDistribuidor = custoFabrica * 0.28;
		porcentagemImpostos = custoFabrica * 0.45;
		custoConsumidor = custoFabrica + porcentagemDistribuidor + porcentagemImpostos;

		System.out.print("O custo do consumidor ser� de: R$" + custoConsumidor);
	}
}