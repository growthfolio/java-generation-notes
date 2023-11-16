package EstruturaDeDados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class EstruturaDeDados_Queue {

	public static void main(String[] args) {
		
		int op;
		Queue<String> fila = new LinkedList<String>();
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("\n**************************************************");
			System.out.println("\t\t\tMenu:");
			System.out.println("\t1- Adicionar Cliente na Fila.");
			System.out.println("\t2- Listar todos os Clientes");
			System.out.println("\t3- Chamar Cliente da Fila");//Retira o cliente da fila
			System.out.println("\t0- Sair");
			System.out.println("\n**************************************************");
	
			System.out.println("\nDigite a opção desejada: ");
			op = leia.nextInt();
		
			switch (op) {
			
			case 1:
				leia.nextLine(); //limpa o cache
				System.out.println("\nDigite o nome do cliente: ");
				String cliente = leia.nextLine();
				fila.add(cliente);
				System.out.println("\nCliente Adicionado!");
				break;
			
			case 2:
				leia.nextLine();
				System.out.println("Lista de Clientes na Fila: ");
				for(String pessoas : fila) {
					System.out.println(pessoas);
				}
				break;
				
			case 3:
			    System.out.println("\nDigite o nome do cliente que deseja chamar: ");
			    String clienteR = leia.nextLine();
			    if (fila.contains(clienteR)) {
			        fila.remove(clienteR);
			        System.out.println("\nO Cliente " + clienteR + " foi chamado.");
			    } else if (fila.isEmpty()) {
			        System.out.println("\nA fila está vazia!");
			    } else {
			        System.out.println("\nCliente não encontrado!");
			    }
			    break;
				
			case 0:
				System.out.println("\nPrograma Finalizado! ");
				break;
				
				default:
					System.out.println("Opção invalida! Digite um numero válido!");
					
			}
		
		}while (op != 0);
		
	}

}
