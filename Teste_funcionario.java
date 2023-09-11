package fia_14;

import java.util.Scanner;

public class Teste_funcionario {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		
		System.out.println("Quando foram suas últimas férias?");
		funcionario.setFerias(ler.next());
		System.out.println("Quando quer tirar suas próximas férias?");
		funcionario.setProxferias(ler.next());
		
		funcionario.Vizualizar();
	}
	

}
