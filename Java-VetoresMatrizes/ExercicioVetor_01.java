package JavaInicial;

import java.util.Scanner;

public class ExercicioVetor_01 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int vetorInteiros[] = {2, 5, 35, 10, 14, 66, 90, 159, 1};
		int buscaNumero,x;
		boolean numeroEncontrado = false;
		
		System.out.println("\nBuscar numeros: ");
		buscaNumero = ler.nextInt();
	
		for(x=0;x < vetorInteiros.length; x++) {
			if (vetorInteiros[x] == buscaNumero) {
				System.out.println("\nO Numero foi encontrado na posição "+x);
				numeroEncontrado = true;
			}
		}
		if (numeroEncontrado = false) {
	        System.out.println("Número não encontrado no vetor.");
	    }

	}

}
