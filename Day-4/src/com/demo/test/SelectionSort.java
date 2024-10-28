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
		for(int i=0;i<arr.length-1;i++) {
			int min_idx=i;			
			for(int j = i+1 ; j<arr.length;j++) {			
				if(arr[j]<arr[min_idx]) {
					min_idx=j;
				}
			}	
		int temp = arr[i];
		arr[i]=arr[min_idx];
		arr[min_idx]=temp;
		System.out.println("Minimum number "+arr[i]+"==="+arr[min_idx]);
		System.out.println(Arrays.toString(arr));
		}	
	}
}
