package com.demo.test;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		
		int[] arr = {12,32,44,2,1,43};
		System.out.println("Given array before sorting ");
		 System.out.println(Arrays.toString(arr));
		 InsertionSort(arr);
		 System.out.println("Given array after sorting ");
	     System.out.println(Arrays.toString(arr));

	}
	

	private static void InsertionSort(int[] arr) {
		for(int i=1;i<arr.length;i++) {
		int num = arr[i];
		int j = i-1;
		
		while(j>=0 && arr[j]>num) {
			arr[j+1] = arr[j];
			j--;
		}
		arr[j+1]=num;
		}
	}

}
