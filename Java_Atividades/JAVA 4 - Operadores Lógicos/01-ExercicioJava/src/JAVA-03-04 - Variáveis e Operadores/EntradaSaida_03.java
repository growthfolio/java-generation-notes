package exercicio_01;

import java.util.Scanner;

public class EntradaSaida_03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;

		System.out.println("\nDigite o salario Bruto: " + "R$");
		salarioBruto = leia.nextFloat();

		System.out.println("\nDigite o adicional noturno: " + "R$");
		adicionalNoturno = leia.nextFloat();

		System.out.println("\nDigite o valor de hora extras: " + "R$");
		horasExtras = leia.nextFloat();
		
		System.out.println("\nDigite o valor de descontos: " + "R$");
		descontos = leia.nextFloat();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras*5) - descontos ;
		
		System.out.println("\n O seu salário liquido é: " + "R$ " +  salarioLiquido);
		/*
		SALÁRIO LÍQUIDO = SALÁRIO BRUTO + ADICIONAL NOTURNO + (HORAS EXTRAS * 5) - DESCONTOS
*/
		
	}

}
