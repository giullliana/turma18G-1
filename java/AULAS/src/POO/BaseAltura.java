package POO;

import java.util.Scanner;

public class BaseAltura {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		Triangulo T3 = new Triangulo(); //objeto
		int base1, altura1, base2, altura2, base3, altura3, area1, area2;
		Double area3;
		
		System.out.println("Digite a base do 1� tri�ngulo:");
		base1 = leia.nextInt();
		System.out.println("Digite a altura do 1� tri�ngulo:");
		altura1 = leia.nextInt();
		System.out.println("Digite a base do 2� tri�ngulo:");
		base2 = leia.nextInt();
		System.out.println("Digite a altura do 2� tri�ngulo:");
		altura2 = leia.nextInt();
		System.out.println("Digite a base do 3� tri�ngulo:");
		T3.base = leia.nextDouble();
		System.out.println("Digite a altura do 3� tri�ngulo:");
		T3.altura = leia.nextDouble();
		
		area1 = (base1 * altura1);
			Math.pow(area1, 2);
		area2 = (base2 * altura2);
			Math.pow(area2, 2);
		area3 = (T3.base * T3.altura) / 2;
		
		System.out.printf("�rea do triangulo 1: %d | Base do tri�ngulo 1: %d | Altura do tri�ngulo 1: %d", area1, base1, altura1);
		System.out.println();
		System.out.printf("�rea do triangulo 2: %d | Base do tri�ngulo 2: %d | Altura do tri�ngulo 2: %d", area2, base2, altura2);
		System.out.println();
		System.out.printf("�rea do triangulo 3: %d | Base do tri�ngulo 3: %d | Altura do tri�ngulo 3: %d", area3, T3.base, T3.altura);
		System.out.println();
		
		if (area1 > area2 && area1 > area3) {
			System.out.println("O tri�ngulo de maior �rea � o 1!");
		}
		else if (area2 > area1 && area2 > area3) {
			System.out.println("O tri�ngulo de maior �rea � o 2!");
		}
		else if (area3 > area1 && area3 > area2) {
			System.out.println("O tri�ngulo de maior �rea � o 3!");
		}
		leia.close();
	}

}
