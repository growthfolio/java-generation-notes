package EstruturaDeDados;

import java.util.Scanner;
import java.util.Stack;

public class EstruturaDeDados_Stack {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Stack<String> pilha = new Stack<String>();
		int op;
		
		do {
			System.out.println("\n**************************************************");
            System.out.println("\t\t\tMenu:");
            System.out.println("\t1- Adicionar Livro na pilha");
            System.out.println("\t2- Listar todos os livros");
            System.out.println("\t3- Retirar um livro da pilha");
            System.out.println("\t0- Sair");
            System.out.println("\n**************************************************");
            
            System.out.print("\n\tDigite a opção desejada: ");
            op = leia.nextInt();
            leia.nextLine(); 

            switch (op) {
                case 1:
                    System.out.print("Digite o nome do livro a ser adicionado: ");
                    String nomeLivro = leia.nextLine();
                    pilha.push(nomeLivro);
                    System.out.println("Livro adicionado!");
                    break;
                case 2:
                    if (pilha.isEmpty()) {
                        System.out.println("A pilha está vazia.");
                    } else {
                        System.out.println("Livros na pilha:");
                        for (String livro : pilha) {
                            System.out.println("- " + livro);
                        }
                    }
                    break;
                case 3:
                    if (pilha.isEmpty()) {
                        System.out.println("A pilha está vazia. Não é possível retirar livros.");
                    } else {
                        String livroRetirado = pilha.pop();
                        System.out.println("Livro retirado: " + livroRetirado);
                    }
                    break;
                case 0:
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (op != 0);
		
	}

}
