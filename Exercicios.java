package exercicios_gen;
import java.util.Scanner;
public class Exercicios {
	
	
	public static void primeira() {
		float salario, abono, novoSalario;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o Salário:");
		salario = scan.nextFloat();
		System.out.println("Digite o Abono:");
		abono = scan.nextFloat();
		novoSalario = salario + abono;
		System.out.printf("Novo Salário: %.2f", novoSalario);
	}
	public static void segunda() {
		float n1, n2, n3, n4, mf;
		Scanner scan = new Scanner(System.in);
		System.out.println("Nota 1:");
		n1 = scan.nextFloat();
		System.out.println("Nota 2:");
		n2 = scan.nextFloat();
		System.out.println("Nota 3:");
		n3 = scan.nextFloat();
		System.out.println("Nota 4:");
		n4 = scan.nextFloat();
		mf = (n1+n2+n3+n4)/4;
		System.out.printf("Média final: %.2f", mf);		
	}	
	public static void terceira() {
		float sBruto, adNoturno, horasExtras, descontos, sLiquido;
		Scanner scan = new Scanner(System.in);
		System.out.println("Salário Bruto:");
		sBruto = scan.nextFloat();
		System.out.println("Adicional Noturno:");
		adNoturno = scan.nextFloat();
		System.out.println("Horas Extras:");
		horasExtras = scan.nextFloat();
		System.out.println("Descontos:");
		descontos = scan.nextFloat();
		sLiquido = sBruto + adNoturno + (horasExtras * 5) - descontos;
		System.out.printf("Salário Liquido: %.2f", sLiquido);
	}	
	public static void quarta() {
		float n1, n2, n3, n4, calculo;
		Scanner scan = new Scanner(System.in);
		System.out.println("numero1");
		n1 = scan.nextFloat();
		System.out.println("numero2");
		n2 = scan.nextFloat();
		System.out.println("numero3");
		n3 = scan.nextFloat();
		System.out.println("numero4");
		n4 = scan.nextFloat();
		calculo = (n1*n2) - (n3*n4);
		System.out.printf("Diferença: %.2f", calculo);
	}	
	
	public static void main(String[] args) {
		int opcao;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o número do exercício que deseja acessar: ");
		opcao = scan.nextInt();
		if(opcao == 1)primeira();
		if(opcao == 2)segunda();
		if(opcao == 3)terceira();
		if(opcao == 4)quarta();
		
	}
	


}

