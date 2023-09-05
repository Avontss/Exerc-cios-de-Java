package dia12;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class exerciciofiladia12 {

	public static void main(String[] args) {
		Queue<String> clientes = new LinkedList<String>();
		Scanner ler = new Scanner(System.in);
		int opcao;
		do {
		System.out.println("\n***********************************************");
		System.out.println("\n1 - Para adicionar cliente a fila"+ "\n2 - Listar todos os clientes da fila " + "\n3 - Retirar cliente da fila" + "\n0 - Para sair");
		System.out.println("\n***********************************************");
		System.out.println("Entre com a opção desejada:");
		
		opcao = ler.nextInt();
		
		
		switch (opcao) {
		
		case 1: System.out.println("Digite o nome: ");
		clientes.add(ler.next());
		System.out.println("Cliente adicionado!");
		System.out.println("\nLista atualizada: " + clientes);
		break;
		
		case 2: if(clientes.isEmpty()) {System.out.println("A lista esta vazia!");} else{System.out.println(clientes);}
		break;
		
		case 3:  if(clientes.isEmpty()) {System.out.println("A lista esta vazia!");} else{ clientes.remove(); System.out.println("O cliente foi removido!" );
		System.out.println("Lista atualizada: "+clientes);}
		break;
		
		default: System.out.printf("Opção invalida");
		
		
		}
		
		} while (opcao !=0);
		System.out.println("Programa Finalizado!");
	}

}
