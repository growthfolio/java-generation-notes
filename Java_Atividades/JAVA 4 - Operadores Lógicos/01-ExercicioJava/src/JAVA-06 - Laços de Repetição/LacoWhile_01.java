package exercicios_03;

import java.util.Scanner;

public class LacoWhile_01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int idade,menor =0,maior =0,i;
		
		System.out.println("Digite uma idade: ");
		idade = leia.nextInt();
		while(idade>=0) {
			
			if(idade < 21) {
				menor++;
			}else if(idade > 50) {
				maior++;
			}
			
		System.out.println("Digite uma idade: ");
		idade = leia.nextInt();
		}
		
		System.out.println("Total de pessoas menores de 21 Anos: "+menor);
		System.out.println("Total de pessoas maiores de 50 Anos: "+maior);
	}

}
		