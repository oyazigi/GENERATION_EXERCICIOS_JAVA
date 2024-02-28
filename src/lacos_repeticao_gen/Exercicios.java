package lacos_repeticao_gen;

import java.util.Scanner;

public class Exercicios {
	
	public static void primeira() {
		int n1, n2;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o primeiro número do intervalo: ");
		n1 = scan.nextInt();
		System.out.println("Digite o último número do intervalo: ");
		n2 = scan.nextInt();
		if(n1 < n2) {
			for(int contador = 0; contador < 15; contador++) {
				if(n1 % 15 != 0) n1++;
			}
			for(int contador = n1; contador < n2; contador += 15) {
				System.out.printf("%d é múltiplo de 3 e 5 \n", contador);
			}
		}else System.out.println("Interválo inválido!");

	}
	public static void segunda() {
		int idade=1,menor21=0,maior50=0;
		Scanner scan = new Scanner(System.in);
		while(idade > 0) {
			System.out.println("Digite uma idade: ");
			idade = scan.nextInt();
			if(idade < 21) menor21++;
			else if(idade > 50) maior50++;
		}
		System.out.printf("Total de pessoas menores que 21 anos: %d\n Total de pessoas maiores que 50: %d \n", menor21, maior50);
	}
	
	public static void terceira() {
		int numero=1, soma=0;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("Digite um número: ");
			numero = scan.nextInt();
			if(numero % 2 == 0) {
				soma+=numero;
			}
		}
		while(numero != 0);
		System.out.printf("A Soma dos números positivos é: %d", soma);
		}
	
	public static void main(String[] args) {
		int opcao;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o número da lista que contém o exercício: ");
		opcao = scan.nextInt();
		if(opcao == 1)primeira();
		else if(opcao == 2)segunda();
		else if(opcao == 3)terceira();
		else System.out.println("Essa lista não existe!");
	}
}
