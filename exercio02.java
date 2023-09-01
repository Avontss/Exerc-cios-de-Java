package exerciciosdodia10;

import java.util.Scanner;

public class exercio02 {

	public static void main(String[] args) {
		int numero, num, par = 0, impar = 0;
		Scanner ler = new Scanner(System.in);

		System.out.println("##### ## Menu ## #####");
		System.out.println("Escreva 10 números para saber quantos são pares e quantos são ímpares:");
		for (num = 1; num < 11; num++) {
			System.out.println("\nDigite o n" + num);
			numero = ler.nextInt();

			if (numero % 2 == 0) {
				par++;

			} else {
				impar++;
			}

		}
		System.out.println("Total de números pares: " + par);
		System.out.println("Total de números pares: " + impar);
		ler.close();
	}
	
	
}
