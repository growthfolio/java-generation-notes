package exercicio_02;

import java.util.Scanner;

public class LacoSwitch_01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);

		int quantidade,codigo;
		double valorTotal = 0.0;
		String produto = "";
		
		System.out.println("Digite o codigo do Produto: ");
		codigo = leia.nextInt();
		System.out.println("Digite a quantidade: ");
		quantidade = leia.nextInt();
		
		switch(codigo) {
		case 1:
			produto = "Cachorro Quente";
            valorTotal = 10.00 * quantidade;
            System.out.println("\nProduto: "+produto+"\nValor Total: R$"+valorTotal);
            break;
		case 2:
			produto = "X-Salada";
            valorTotal = 15.00 * quantidade;
            System.out.println("\nProduto: "+produto+"\nValor Total: R$"+valorTotal);
            break;
		case 3:
			produto = "X-Bacon";
            valorTotal = 18.00 * quantidade;
            System.out.println("\nProduto: "+produto+"\nValor Total: R$"+valorTotal);
            break;
		case 4:
			produto = "Bauru";
            valorTotal = 12.00 * quantidade;
            System.out.println("\nProduto: "+produto+"\nValor Total: R$"+valorTotal);
            break;
		case 5:
			produto = "Refrigerante";
            valorTotal = 8.00 * quantidade;
            System.out.println("\n Produto: "+produto+"\nValor Total: R$"+valorTotal);
            break;
		case 6:
			produto = "Suco de laranja";
            valorTotal = 13.00 * quantidade;
            System.out.println("\n Produto: "+produto+"\nValor total: R$"+valorTotal);
            break;
		default:
			System.out.println("\nOpção Inválida!!!");
            
		}
	}

}
