package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class CollectionSet_04 {

	public static void main(String[] args) {
	
	Scanner leia = new Scanner(System.in);
	Set<Integer> colectSet = new HashSet<>();
	
	colectSet.add(10);
	colectSet.add(9);
	colectSet.add(8);
	colectSet.add(7);
	colectSet.add(6);
	colectSet.add(5);
	colectSet.add(4);
	colectSet.add(3);
	colectSet.add(2);
	colectSet.add(1);
	
	Iterator<Integer> iterator = colectSet.iterator();
	
	System.out.println("\nDigite um numero Inteiro: ");
	int userNum = leia.nextInt();
	Boolean numeroEncontrado = false;
	
	  while (iterator.hasNext()) {
          int numero = iterator.next();
          if (userNum == numero) {
        	  numeroEncontrado = true;
              break;
          }
      }
	  if (numeroEncontrado) {
          System.out.println("Número " + userNum + " Encontrado!");
      } else {
          System.out.println("O número " + userNum + " não foi encontrado!");
      }
	
	
	}

}
