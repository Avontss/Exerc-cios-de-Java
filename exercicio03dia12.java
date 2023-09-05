package dia12;

import java.util.Scanner;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class exercicio03dia12 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Set<String> setNumeros = new HashSet<String>();
		
		for(int indice=0; indice<10; indice++) {
			System.out.println("Digite 10 números inteiros: ");
			setNumeros.add(ler.nextLine());
			
		} System.out.println("Dados do set:"+"\n");
		Iterator<String> inumeros = setNumeros.iterator();
		while (inumeros.hasNext()) {
			System.out.println(inumeros.next());
		}

	}

}
