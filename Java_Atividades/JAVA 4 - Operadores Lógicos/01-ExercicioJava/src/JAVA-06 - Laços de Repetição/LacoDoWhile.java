package exercicios_03;

import java.util.Scanner;

public class LacoDoWhile {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero,resultado = 0;
		
		do {
			System.out.println("\nDigite um número inteiro: ");
	        numero = leia.nextInt();
			
	        if(numero > 0) {
	        	resultado += numero;
	        }
	        
	        
	        
			
		}while (numero !=0);
		
		System.out.println("\nO resultado da soma é: " + resultado);
	}

}
