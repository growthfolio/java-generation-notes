package exercicio_01;

import java.util.Scanner;

public class EntradaSaida_02 {

	public static void main(String[] args) {
	
	Scanner leia = new Scanner(System.in);
	
	float n1,n2,n3,n4,mediaFinal;
	
	System.out.println("\nDigite o valor da nota 1: ");
	n1 = leia.nextFloat();

	System.out.println("\nDigite o valor da nota 2: ");
	n2 = leia.nextFloat();

	System.out.println("\nDigite o valor da nota 3: ");
	n3 = leia.nextFloat();
	
	System.out.println("\nDigite o valor da nota 4: ");
	n4 = leia.nextFloat();
	
	mediaFinal = (n1+n2+n3+n4)/4;
	
	System.out.println("\r Sua nota final é: "+mediaFinal);
	
	
	
	}

}
