package LISTA_2;

import java.util.Scanner;

public class Ex1MaiorDeTres {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int primeiroNum, segundoNum, terceiroNum;
	
		System.out.println("Primeiro n�mero:");
		primeiroNum = ler.nextInt();
		System.out.println("Segundo n�mero:");
		segundoNum = ler.nextInt();
		System.out.println("Terceiro n�mero:");
		terceiroNum = ler.nextInt();
		
		if (primeiroNum > segundoNum && primeiroNum > terceiroNum) {
			System.out.println("O primeiro n�mero � o maior!");
		}
		else if (segundoNum > primeiroNum && segundoNum > terceiroNum) {
			System.out.println("O segundo n�mero � o maior!");
		}
		else if (terceiroNum > primeiroNum && terceiroNum > segundoNum) {
			System.out.println("O terceiro n�mero � o maior!");
		}
		else if (primeiroNum == segundoNum || primeiroNum == terceiroNum || segundoNum == terceiroNum) {
			System.out.println("Voc� digitou 2 ou mais n�meros iguais.");
		}
		
	ler.close();
	}
}