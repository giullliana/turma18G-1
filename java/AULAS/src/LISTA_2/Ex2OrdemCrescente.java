package LISTA_2;

import java.util.Scanner;

public class Ex2OrdemCrescente {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int primeiroNum, segundoNum, terceiroNum;
	
		System.out.println("Primeiro n�mero:");
		primeiroNum = ler.nextInt();
		System.out.println("Segundo n�mero:");
		segundoNum = ler.nextInt();
		System.out.println("Terceiro n�mero:");
		terceiroNum = ler.nextInt();
	
		if (primeiroNum <= segundoNum && primeiroNum <= terceiroNum) {
			if (segundoNum <= terceiroNum) {
				System.out.println("Em ordem crescente temos: " + primeiroNum + " - " + segundoNum + " - " + terceiroNum);
			}	else {
					System.out.println("Em ordem crescente temos: " + primeiroNum + " - " + terceiroNum + " - " + segundoNum);
				}
		} 
		if (segundoNum <= primeiroNum && segundoNum <= terceiroNum) {
			if (primeiroNum <= terceiroNum) {
				System.out.println("Em ordem crescente temos: " + segundoNum + " - " + primeiroNum + " - " + terceiroNum);
			}	else {
					System.out.println("Em ordem crescente temos: " + segundoNum + " - " + terceiroNum + " - " + primeiroNum);
				}
		} 
		if (primeiroNum <= terceiroNum) {
				System.out.println("Em ordem crescente temos: " + terceiroNum + " - " + primeiroNum + " - " + segundoNum);
		}
		else {
			System.out.println("Em ordem crescente temos: " + terceiroNum + " - " + segundoNum + " - " + primeiroNum);
		}
		
	ler.close();
	}
}
