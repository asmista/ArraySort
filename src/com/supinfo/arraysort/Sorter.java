package com.supinfo.arraysort;

import java.util.Random;

public class Sorter {

	
	static int[] bubbleSort(int[] array) {
		boolean swapped = true;
		int j = 0;
		int tmp;
		
		while(swapped) {
			swapped = false;
			j++;
			
			for(int i= 0; i < array.length - j; i++) {
				if(array[i] > array[i+1]) {
					tmp = array[i];
					array[i] = array[i+1];
					array[i+1] = tmp;
					swapped = true;
				}
			}
		}		
		return array;
	}
	
	static void displaySort(int[] array) {
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}
	
	public static void main(String... args) {
		int[] array = new int[10];
		Random random = new Random();
		for(int i=0; i < 10; i++) {
			array[i] = random.nextInt(100);
		}
		displaySort(array);
		System.out.println("");
		bubbleSort(array);
		displaySort(array);
	}

}
