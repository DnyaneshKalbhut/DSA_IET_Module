package com.demo.test;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = {12,32,44,2,1,43};
		System.out.println("Given array before sorting ");
		 System.out.println(Arrays.toString(arr));
		 selectionSort(arr);
		 System.out.println("Given array after sorting ");
	     System.out.println(Arrays.toString(arr));

	}

	private static void selectionSort(int[] arr) {
		for(int i = 0 ; i < arr.length ; i++) {			
			int min = findMin(arr);
			int current = arr[i];
			int temp = current;		
		}
		
	}

	public static int findMin(int[] arr) {
		int min = arr[0];
		for(int i = 1; i<arr.length;i++ ) {
		if(arr[i]<min) {
			min=arr[i];
		}
	}
		return min;
}

}
