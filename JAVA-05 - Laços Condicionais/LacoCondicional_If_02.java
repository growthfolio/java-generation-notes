package exercicio_02;

import java.util.Scanner;

public class LacoCondicional_If_02  {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int n1,resultado;
		
		
		System.out.println("\nInsira um numero inteiro: ");
		n1 = leia.nextInt();
		
		
		if(n1 % 2 == 0) {
			System.out.println("\nO numero "+n1+" é Par ");
		}else {
			System.out.println("\nO numero "+n1+" é Impar ");
		}
		
		if(n1>0) {
			System.out.println("\nO numero "+n1+" é Positivo ");
		}else if(n1<0) {
			System.out.println("\nO numero "+n1+" é Negativo ");
		}else {
			System.out.println("\nO numero é Zero ");
		}
			
		
		/*
		Escreva um algoritmo em Java, 
		que leia um número inteiro via teclado e mostre na tela uma mensagem 
		indicando se este número é par ou ímpar e se o número é positivo ou negativo. 
		Veja os exemplos abaixo:
		*/
		
		
	}

}
