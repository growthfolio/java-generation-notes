package exercicio_02;

import java.util.Scanner;
/* Exercicio
Faça um algoritmo em Java que leia 3 valores inteiros A, B e C e imprima na tela 
se a soma de A + B é maior, menor ou igual a C.
*/
public class LacoCondicional_If_01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		int valorA, valorB,valorC,resposta;
		
		System.out.println("\nInsira o valor A: ");
		valorA = leia.nextInt();
		System.out.println("\nInsira o valor B: ");
		valorB = leia.nextInt();
		System.out.println("\nInsira o valor C: ");
		valorC = leia.nextInt();
		
		resposta = (valorA + valorB);
		
		if(resposta > valorC) {
			System.out.println("\n A soma de A e B é maior que " +valorC);
		}else if (resposta < valorC) {
			System.out.println("\n A soma de A e B é menor que " +valorC);	
		}else{
			System.out.println("\n A soma de A e B é igual a " +valorC);
		}
	}

}
