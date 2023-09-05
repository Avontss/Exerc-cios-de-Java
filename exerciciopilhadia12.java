package dia12;
import java.util.Scanner;
import java.util.Stack;
public class exerciciopilhadia12 {

	public static void main(String[] args) {
		Stack<String> livros = new Stack<String>();
		Scanner ler = new Scanner(System.in);
		int opcao;
		do {
		System.out.println("\n***********************************************");
		System.out.println("\n1 - Para adicionar livro" + "\n2 - Listar todos os livros" + "\n3 - Retirar livro da pilha" + "\n0 - Para sair");
		System.out.println("\n***********************************************");
		System.out.println("Entre com a opção desejada:");
		
		opcao = ler.nextInt();
		switch (opcao) {
		case 1: System.out.println("Digite o nome de um livro:");
		ler.skip("\\R?");
		livros.push(ler.nextLine());
		System.out.println("Livro adicionado!");
		System.out.println("\nLista atualizada: " + livros);
		break;
		
		case 2: if (livros.isEmpty()) {System.out.println("A pilha esta Vazia!");} else {System.out.println(livros);}
		break;
		
		case 3:  if (livros.isEmpty()) {System.out.println("A pilha esta Vazia!");} else {livros.pop();System.out.println("O livro foi retirado!");
		System.out.println("Lista atualizada" + livros);}
		break;
		
		default: System.out.printf("Opção invalida");
		
	}
		
			
	} while  (opcao !=0);
		System.out.println("\nPrograma Finalizado!");
	}
}
