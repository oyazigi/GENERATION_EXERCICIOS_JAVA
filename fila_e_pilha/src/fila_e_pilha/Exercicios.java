package fila_e_pilha;
import java.util.Scanner;
import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Stack;
public class Exercicios {
	
	public static void primeira() {
		int op=1;
		String nome;
		Queue<String> clientesQueue = new PriorityQueue<>();
		Scanner scan = new Scanner(System.in);
		System.out.println("****************************************************************");
		System.out.println("         1 - Adicionar Cliente na Fila");
		System.out.println("         2 - Listar todos os Clientes");
		System.out.println("         3 - Retirar Cliente da Fila");
		System.out.println("         0 - Sair");
		System.out.println("****************************************************************");
		while(op != 0) {
			System.out.println("Entre com a opção desejada: ");
			op = scan.nextInt();
			if(op == 1) {
				System.out.println("Digite o nome do cliente: ");
				scan.nextLine();
				nome = scan.nextLine();
				clientesQueue.add(nome);
				System.out.println("Cliente adicionado com sucesso!: ");
			}else if(op == 2) System.out.println("Lista de clientes na fila: " + clientesQueue);
			else if(op == 3) {
				try{
					clientesQueue.remove();
					System.out.println("Lista de clientes na fila: " + clientesQueue);
					System.out.println("O Cliente foi chamado!");
				}catch(Exception ex){
					System.out.println("A Fila está vazia!");
				}
			}
		}
		
		System.out.println("Programa finalizado!");
		scan.close();
	}
	public static void segunda() {
		int op=1;
		String livro;
		Stack<String> pilhaLivros = new Stack<String>();
		Scanner scan = new Scanner(System.in);
		System.out.println("****************************************************************");
		System.out.println("         1 - Adicionar Livro na pilha");
		System.out.println("         2 - Listar todos os Livros");
		System.out.println("         3 - Retirar Livro da pilha");
		System.out.println("         0 - Sair");
		System.out.println("****************************************************************");
		while(op != 0) {
			System.out.println("Entre com a opção desejada: ");
			op = scan.nextInt();
			if(op==1) {
				System.out.println("Digite o nome: ");
				scan.nextLine();
				livro = scan.nextLine();
				pilhaLivros.push(livro);
				System.out.println("Pilha: " + pilhaLivros);
				System.out.println("Livro adicionado!");
			}else if(op==2)System.out.println("Pilha: " + pilhaLivros);
			else if(op==3) {
				try {
					pilhaLivros.pop();
					System.out.println("Pilha: " + pilhaLivros);
					System.out.println("Um livro foi retirado da pilha!");
				} catch(Exception ex) {
					System.out.println("A Pilha esta vazia!");
				}
				
			}
		}
		System.out.println("Programa Finalizado!");
	}

	public static void main(String[] args) {
		int opcao;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o número do exercício: ");
		opcao = scan.nextInt();
		if(opcao == 1)primeira();
		else if(opcao == 2)segunda();
		else System.out.println("Esse exercício não!");
		scan.close();

	}

}
