package lacos_condicionais_gen;

import java.util.Scanner;

public class Exercicios {
	public static void primeira_1() {
		int a,b,c;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o número A: ");
		a = scan.nextInt();
		System.out.println("Digite o número B: ");
		b =scan.nextInt();
		System.out.println("Digite o número C: ");
		c = scan.nextInt();
		if(a + b < c)System.out.println("A Soma de A e B é menor do que C");
		else System.out.println("A Soma de A e B é maior do que C");
		
	}
	public static void primeira_2() {
		int numero;
		String negatividade, paridade;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o número: ");
		numero = scan.nextInt();
		if(numero > 0)negatividade="positivo";
		else negatividade="negativo";
		if(numero % 2 == 0) paridade="par";
		else paridade="impar";
		System.out.printf("O Número digitado é %s e %s", negatividade, paridade);
	}
	public static void segunda_5() {
		int codigo=0, quant=0, preco=0;
		String produto="";
		Scanner scan = new Scanner(System.in);
		System.out.println("Código do produto: ");
		codigo = scan.nextInt();
		switch(codigo) {
		case 1:
			produto = "Cachorro quente";
			preco = 10;
			break;
		case 2:
			produto = "X-Salada";
			preco = 15;
			break;
		case 3:
			produto = "X-Bacon";
			preco = 18;
			break;
		case 4:
			produto = "Bauru";
			preco = 12;
			break;
		case 5:
			produto = "Refrigerante";
			preco = 8;
			break;
		case 6:
			produto = "Suco de laranja";
			preco = 13;
			break;
		}
		System.out.println("Quantidade: ");
		quant = scan.nextInt();
		System.out.printf("O Produto é: %s\nO valor total foi de: %d", produto, preco * quant);
	}
	public static void segunda_7() {
		float n1,n2;
		int op;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o 1° numero: ");
		n1 = scan.nextFloat();
		System.out.println("Digite o 2° numero: ");
		n2 = scan.nextFloat();
		System.out.println("Operação: ");
		op = scan.nextInt();
		switch(op) {
		case 1:
			System.out.printf("%.2f + %.2f = %.2f", n1, n2, n1+n2);
			break;
		case 2:
			System.out.printf("%.2f - %.2f = %.2f", n1, n2, n1-n2);
			break;
		case 3:
			System.out.printf("%.2f * %.2f = %.2f", n1, n2, n1*n2);
			break;
		case 4:
			System.out.printf("%.2f / %.2f = %.2f", n1, n2, n1/n2);
			break;
		default:
			System.out.println("Opção inválida!");
		}
		
	}
	public static void primeira() {
		int exercicio;
		System.out.println("Digite o número do exercicio: ");
		Scanner scan = new Scanner(System.in);
		exercicio = scan.nextInt();
		if(exercicio == 1)primeira_1();
		if(exercicio == 2)primeira_2();
		if(exercicio != 1 && exercicio != 2)System.out.println("Esse exercício não existe ou não foi feito!");
		
	}
	public static void segunda() {
		int exercicio;
		System.out.println("Digite o número do exercicio: ");
		Scanner scan = new Scanner(System.in);
		exercicio = scan.nextInt();
		if(exercicio == 5)segunda_5();
		if(exercicio == 7)segunda_7();
		if(exercicio != 5 && exercicio != 7)System.out.println("Esse exercício não existe ou não foi feito!");
		
	}	

	public static void main(String[] args) {
		int opcao;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o número da lista que contém o exercício: ");
		opcao = scan.nextInt();
		if(opcao == 1)primeira();
		if(opcao == 2)segunda();
		if(opcao != 1 && opcao != 2)System.out.println("Essa lista não existe!");
	}

}
