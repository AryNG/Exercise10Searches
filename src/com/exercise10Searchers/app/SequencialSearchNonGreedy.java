package com.exercise10Searchers.app;
import java.util.Random;
import java.util.Scanner;
public class SequencialSearchNonGreedy {

	public static void main(String[] args) {
		//constants and variables
		final int elements = 100;
		int numberToFind = 0;
		int indexFound=-1;
		boolean isFound=false;
		int index=0;
		
		//Arrays and bounds
		int [] vector = new int [elements];
		int bound=0;
		
		//imports
		Random random = new Random (System.nanoTime());
		Scanner input = new Scanner(System.in);
		
		//Poblacion
		for (int i=0; i<elements;i++) {
			vector[i]=random.nextInt(101);
			System.out.print(vector[i]+" ");
		}
		System.out.println("");
		do { //cuando es <=0 entonces no puedes intruducir el 0, pero si es <0 entonces is puedes meter ceros. 
			System.out.println("Input");
			numberToFind=input.nextInt();
			if(numberToFind<0)
			{
				System.out.println("number must be greater than or equal to zero");
			}
		}while(numberToFind<0);
		
		for(int i=0; i<elements;i++) {
			if (numberToFind==vector[i]) {
			indexFound=i;
			break;
			}
			/* esta parte basicamente es lo mismo que lo definido con el while
		}
		if (indexFound!=-1)
		{
			System.out.println("element found at index:"+indexFound);
		}
		else
		{
			System.out.println("element no found");*/
		}
		
		while(!isFound && index<elements) {
			if (numberToFind==vector[index]) {
				indexFound=index;
				isFound=true;
			}
			index++;
		}
		if(indexFound!=-1) {
			System.out.println("Element found at index:" + indexFound);
		}
		else {
			System.out.println("element no found");
		}
		input.close();
	}
/* aqui la parte del while está repitiendo a una parte que ya habiamos hecho con  for,
 *  por ellos nos marca dos veces el mismo mensaje*/
}
