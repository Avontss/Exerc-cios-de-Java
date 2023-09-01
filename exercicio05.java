package exerciciosdodia10;

import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int num =0 , resultado = 0;
		
		do {
			System.out.println("Digite um número:");
			num = ler.nextInt();
			
		if (num >= 0) {
			resultado += num;
			
			
		}
			
		} while (num != 0);
		System.out.println("A soma dos números positivos é: " + resultado);
		ler.close();
		}
	}


