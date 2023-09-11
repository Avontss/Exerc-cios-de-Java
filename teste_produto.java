package fia_14;

import java.util.Scanner;

public class teste_produto {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Produto produto = new Produto();
		
		System.out.println("Qual é o preço médio do jogo?");
		produto.setPrecoM(ler.nextFloat());
		System.out.println("Qual é preço promocional do jogo?");
		produto.setPrecoP(ler.nextFloat());
		
		produto.Vizualizar();
		

	}

}
