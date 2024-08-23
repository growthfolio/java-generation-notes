package JavaInicial;

import java.util.Scanner;

public class ExercicioVetor_02 {

	public static void main(String[] args) {
		

		int vet[] = new int[10];
		int somaVetor=0,x;
		float mediaVet;
		
		Scanner leia = new Scanner(System.in);
		
		for(x=0;x<10;x++) {
			System.out.println("\nEntre com um numero: ");
			vet[x] = leia.nextInt();
			if(x % 2 ==1) {
				System.out.println("\nElemento Indice Impar: "+vet[0]);
			}
			if(vet[x]% 2== 0) {
				System.out.println("\nO numero: "+vet[x]+ " é um elemento Par");
			}
			somaVetor += vet[0];
		}
		mediaVet = somaVetor / x;
		System.out.println("\nSoma dos Elementos do vetor: " +somaVetor);
		System.out.println("\nA média dos elementos do vetor: " +mediaVet);
	}

}
