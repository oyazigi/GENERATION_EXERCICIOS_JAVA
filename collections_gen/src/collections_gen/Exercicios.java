package collections_gen;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exercicios {
	
	public static void primeira() {
		String cor;
		int i;
		Scanner scan = new Scanner(System.in);
		ArrayList<String> cores = new ArrayList<String>();
		for(i = 0; i <5; i++) {
			System.out.printf("Digite a %d° cor\n", i+1);
			cor = scan.nextLine();
			cores.add(i, cor);
		}
		System.out.println("Listar todas as cores:");
		for(i = 0; i < 5; i++) {
			System.out.printf("%s\n", cores.get(i));
		}
		Collections.sort(cores);
		System.out.println("\nOrdenar as cores: ");
		for(i = 0; i < 5; i++) {
			System.out.printf("%s\n", cores.get(i));
		}
		scan.close();
	}
	public static void segunda() {
		int op;
		Set<Integer> setNumeros = new HashSet<Integer>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite 10 números inteiros:");
		for(int i = 0; i < 10; i++) {
			System.out.printf("%d° Número: \n", i+1);
			op = scan.nextInt();
			setNumeros.add(op);
		}
		scan.close();
		System.out.println("Listar dados do Set:");
		Iterator<Integer> iNumeros = setNumeros.iterator();
		while(iNumeros.hasNext()) {
			System.out.println(iNumeros.next());
		}
	}

	public static void main(String[] args) {
		int opcao;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o número da lista que contém o exercício: ");
		opcao = scan.nextInt();
		if(opcao == 1)primeira();
		else if(opcao == 2)segunda();
		else System.out.println("Essa lista não existe!");
		scan.close();
	}

}
