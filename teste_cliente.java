package fia_14;

import java.util.Scanner;

public class teste_cliente {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		cliente Cliente = new cliente();

		System.out.println("Cadastre o seu novo cliente!");
		System.out.println("Digite o nome do cliente: ");
		Cliente.setNome(ler.nextLine());
		System.out.println("Digite a idade: ");
		Cliente.setIdade(ler.nextInt());
		System.out.println("Qual o sexo do cliente? ");
		Cliente.setSexo(ler.next());
		System.out.println("Digite o salário do cliente: ");
		Cliente.setSalario(ler.nextFloat());
		System.out.println("Digite o endereço do cliente: ");
		ler.skip("\\R?");
		Cliente.setEndereco(ler.nextLine());

		Cliente.Vizualizar();
	}

}
