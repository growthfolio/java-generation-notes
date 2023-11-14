package JavaInicial;

import java.util.Scanner;

public class ExercicioMatriz_02 {

	public static void main(String[] args) {
		
		float part[][] = new float[3][4];
		float media[] = new float[3];
		int x,y;
		float somaNota=0;
		Scanner leia = new Scanner(System.in);
		for(x=0;x<3;x++) {
			for(y=0;y<4;y++) {
				System.out.println("\n Entre com a "+(y+1)+ "ª nota: ");
				part[x][y] = leia.nextFloat();
				somaNota+= part[x][y];
			}
				media[x] = somaNota/4;
				somaNota = 0;
		}
		for(x=0;x<3;x++) {
			System.out.println("\nMédia do participante "+(x+1)+":"+media[x]);
		}
	}

}
