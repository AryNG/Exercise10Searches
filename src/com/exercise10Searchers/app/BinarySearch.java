package com.exercise10Searchers.app;
import java.util.Scanner;
import java.util.Random;
public class BinarySearch {

	public static void main(String[] args) {
//finals--------------------------------------------------------------------------------------------------------------------
		final int elementos=100;
		
//variables-----------------------------------------------------------------------------------------------------------------
		int numberToFind=0;
		int indexFound=0;
		int limInf=0;
		int limSup=elementos-1;
		int pivotal=limInf+(limSup-limInf)/2;
		int temp=0;
		
//Arrays and such-----------------------------------------------------------------------------------------------------------
		int [] vector=new int[elementos];
		
//imports-------------------------------------------------------------------------------------------------------------------
		Random random= new Random(System.nanoTime());
		Scanner input= new Scanner(System.in);
		
//Array Visualization-------------------------------------------------------------------------------------------------------
		for (int i=0; i<elementos;i++) {
			vector[i]= random.nextInt(101);
		}
		for (int i=0; i<elementos;i++) {
			System.out.print(vector[i]+" ");
		}
		System.out.println("");
		
//Sorting algorithm---------------------------------------------------------------------------------------------------------
		for (int i=0;i<elementos;i++) {
			for (int j=0; j<elementos-1;j++) {
				if (vector[j]>vector[j+1]) {
					temp=vector[j+1];
					vector[j+1]=vector[j];
					vector[j]=temp;
				}
			}
		}
		System.out.println(" ");
//Array Visualization-------------------------------------------------------------------------------------------------------
		for (int i=0;i<elementos;i++)
		{
			System.out.print(vector[i]+" ");
	}
		System.out.println(" ");
//Ask the user for the number to find---------------------------------------------------------------------------------------
				do 
				{
					System.out.println(" ");
					System.out.println("Give a number:");
					numberToFind=input.nextInt();
					if (numberToFind<0) 
					{
						System.out.println("must be positive");
					}
				} while(numberToFind<0);
//Binary Search part--------------------------------------------------------------------------------------------------------
		while (limInf<=limSup) 
		{
			pivotal= limInf+(limSup-limInf)/2;
			if(numberToFind==vector[pivotal])
			{
				indexFound=pivotal;
				break;
			}
			else if (numberToFind>vector[pivotal]) 
			{
				limInf=pivotal+1;
			}
			else if (numberToFind<vector[pivotal]) 
			{
				limSup=pivotal-1;
			}
		}
		if (indexFound!=-1) {
			System.out.println("Element found at index:" +indexFound);
		}
		else {
			System.out.println("Element not found....");
		}
//CLOSE SCANNER-------------------------------------------------------------------------------------------------------------
		input.close();
	}

}
