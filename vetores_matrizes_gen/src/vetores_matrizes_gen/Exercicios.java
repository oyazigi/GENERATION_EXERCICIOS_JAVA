package vetores_matrizes_gen;
import java.util.Scanner;
public class Exercicios {
	
	public static void primeira() {
		
		int vetor[] = new int[10];
		int op;
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < 10; i++) {
			System.out.printf("Digite o %d° número do vetor: \n", i+1);
			vetor[i] = scan.nextInt();
		};
		System.out.println("Muito bem, agora qual número você deseja saber o índice?\n");
		op = scan.nextInt();
		for(int i = 0; i < 10; i++) {
			if(vetor[i] == op) {
				System.out.printf("O Número %d se encontra no índice %d do vetor!\n", op, i);
			}
		}
		
	}
	
	public static void segunda() {
		Scanner scan = new Scanner(System.in);
		int[][] matriz = new int[3][3];
		for(int i = 0; i < 3; i++) {
			for(int x = 0; x < 3; x++) {
				System.out.printf("Digite o número da posição [%d][%d]", i+1, x+1);
				matriz[i][x] = scan.nextInt();
			}
		}
		System.out.printf("Elementos da diagonal principal: %d %d %d \n", matriz[0][0], matriz[1][1], matriz[2][2]);
		System.out.printf("Elementos da diagonal secundária: %d %d %d \n", matriz[0][2], matriz[1][1], matriz[2][0]);
		System.out.printf("Soma dos elementos da diagonal principal: %d \n", matriz[0][0] + matriz[1][1] + matriz[2][2]);
		System.out.printf("Soma dos elementos da diagonal secundáiria: %d \n", matriz[0][2] + matriz[1][1] + matriz[2][0]);
	}

	public static void main(String[] args) {
		
		int opcao;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o número da lista que contém o exercício: ");
		opcao = scan.nextInt();
		if(opcao == 1)primeira();
		else if(opcao == 2)segunda();
		else System.out.println("Essa lista não existe!");

	}
}
