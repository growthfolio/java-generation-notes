package exercicio_01;

import java.util.Scanner;

public class EntradaSaida_01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		float abono, salario, novoSalario;

		System.out.println("\nDigite o valor do salário (ex:1000,00): ");
		salario = leia.nextFloat();
		
		System.out.println("\nDigite o valor do abono: ");
		abono = leia.nextFloat();
		
		novoSalario = salario + abono;
		System.out.println(novoSalario);
		
	}

}
