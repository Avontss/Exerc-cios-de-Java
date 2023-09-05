package dia12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class exercicio01dia12 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		ArrayList<String> cores = new ArrayList<String>();
		String y = String.valueOf(5);
		
		
		for (int indice =0; indice <5; indice ++) {System.out.println("Insira 5 cores:");
		cores.add(ler.nextLine());}
		
		cores.sort(null);
		System.out.println("Lista ordenada: "+ "\n"+ cores);
	
	}

}
