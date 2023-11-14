package exercicio_01;
import java.util.Scanner;

public class EntradaSaida_04 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double n1,n2,n3,n4,dif;
		/*
		n1 = 5.0;
		n2 = 6.0;
		n3 = -7.0;
		n4 = 8.0;
		*/
		System.out.println("\nDigite o numero 1: ");
		n1 = leia.nextFloat();

		System.out.println("\nDigite o numero 2: ");
		n2 = leia.nextFloat();

		System.out.println("\nDigite o numero 3: ");
		n3 = leia.nextFloat();
		
		System.out.println("\nDigite o numero 4: ");
		n4 = leia.nextFloat();
		
		System.out.println("Os números escolhidos foram: " + n1 +"; " + n2 +"; " + n3 + " e " + n4 );

		dif = (n1*n2)- (n3*n4) ;
		
		System.out.println("A diferença do produto entre o n1 e n2 pelo produto entre o n3 e o n4 é de: " + dif );
	}

}
