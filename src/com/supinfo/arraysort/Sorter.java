//package com.supinfo.arraysort;

import java.util.Random;


public class Sorter {
	static int[] bubbleSort(int array[])
	{
		boolean swap=false;
		do{
			swap=false;
	        	for(int i=0;i<(array.length-1);i++){
	                	if(array[i]>array[i+1]){
		                	array[i] = array[i] ^ array[i+1];
		                	array[i+1] = array[i] ^ array[i+1];
		                	array[i] = array[i] ^ array[i+1];
		                	swap=true;
	                	}
	        	}
		}while(swap);
		
		return array;
	}
	
	static int[] selectionSort(int[] array)
	{
		int min=0;
		for(int i=0;i<(array.length-1);i++)
		{
			min=i;
			for(int j=i+1;j<array.length;j++)
			{
				if(array[j] < array[min])
					min=j;
			}
			if(min!=i)
			{
				array[i] = array[i] ^ array[min];
               			array[min] = array[i] ^ array[min];
               			array[i] = array[i] ^ array[min];
			}
		}
		return array;
	}
	
	static int[] insertionSort(int[] array)
	{
		int j=0,x=0;
		for(int i=1;i<array.length;i++)
		{
			x = array[i];
			j = i;
			
			while(j>0 && array[j-1]>x)
			{
				array[j] = array[j-1];
				j--;
			}
					
			 array[j] = x;
		}
		
		return array;
	}
	
	static void displayArray(int[] array)
	{
		for(int i=0;i<array.length;i++)
			System.out.print(array[i]+" ");
	}
	
	public static void main(String[] args )
	{
		int array[]= new int[10];
		Random random = new Random();
		
        	for(int i=0; i < 10; i++) 
                	array[i] = random.nextInt(100);
                
	        displayArray(array);
	        System.out.print('\n');
	        bubbleSort(array);
	        displayArray(array);
	}

}
