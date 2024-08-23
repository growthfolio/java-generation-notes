package exercicios_03;

import java.util.Scanner;

public class LacoFor_01 {

	public static void main(String[] args) {
		
	Scanner leia = new Scanner(System.in);	
		
	int n1,n2,intervalo,i;
	
		System.out.println("\nDigite o primeiro numero: ");
		n1 = leia.nextInt();
		System.out.println("\nDigite o segundo numero: ");
		n2 = leia.nextInt();
		
		if(n1 >= n2) {
			System.out.println("\n\t\tIntervalo inválido! "+"\nO Primeiro numero deve ser menor que o Segundo!!!");
		}else {
			
			
		}for(i=n1;i<=n2;i++) {
			
			if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i+" é múltiplo de 3 e 5");
			}    
		}
		
	
		
		
		
	}

}
