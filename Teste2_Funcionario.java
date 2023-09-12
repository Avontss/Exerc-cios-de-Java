package fia_14;

import java.util.Scanner;

public class Teste2_Funcionario {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		vendedor Vendedor = new vendedor("Jorge", 43, "21/08", "Vanderson", 30, "31/03", "0", "0",
				"0", "0", "40h semanais", "36h semanis");
		System.out.println("Quando foram as últimas férias do gerente?");
		Vendedor.setFeriasGerente(ler.nextLine());
		System.out.println("Quando ele quer tirar as próximas férias? ");
		Vendedor.setProxferiasGerente(ler.nextLine());
		System.out.println("Quando foram as últimas férias do vendedor?");
		Vendedor.setFeriasVendedor(ler.nextLine());
		System.out.println("Quando ele quer tirar férias?");
		Vendedor.setProxferiasVendedor(ler.nextLine());

		Vendedor.Vizualizar();
	}

}
