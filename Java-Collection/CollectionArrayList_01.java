package Collections;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CollectionArrayList_01 {

	public static void main(String[] args) {
		
		List<String> listaCores = new ArrayList<String>();// Criando lista para armazenar as cores
		Scanner leia = new Scanner(System.in);
		
		for(int i=0;i<5;i++) {//Solicitando as cores para usuario
			System.out.println("\nDigite a cor: "+(i+1)+ " : ");
			String cor = leia.nextLine();
			listaCores.add(cor);//Adicionando a variavel "cor" na lista de cores
		}
		System.out.println("\nAs cores adicionadas foram:");
		for(String cor : listaCores) {
			System.out.println(cor);
		}
		 Collections.sort(listaCores);// O metodo sort ordena a lista em ordem crescente
		 
		 System.out.println("\nCores ordenadas na ordem crescente:");
	        for (String cor : listaCores) {
	            System.out.println(cor);
	        }
		
		
		
		
	}

}
