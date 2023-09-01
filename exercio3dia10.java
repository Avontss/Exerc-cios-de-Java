package exerciciosdodia10;

import java.util.Scanner;

public class exercio3dia10 {

	public static void main(String[] args) {
		
		int idade = 0,col1 = 0,col2 = 0;
		
		Scanner ler = new Scanner(System.in);
		
	
		
		while (idade >= 0) {
			System.out.println("Digite sua idade: ");
			idade = ler.nextInt();
			
			 if (idade < 21 && idade > 0) {
			 col1++;
			 } else if (idade > 50) {
			col2++;
			 }
			 }
		System.out.println("Total de pessoas menores de 21 anos:" + col1);
		System.out.println("Total de pessoas maiores de 50 anos:" + col2);
		ler.close();
		}
	}


