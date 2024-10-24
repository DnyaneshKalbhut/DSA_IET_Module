package com.demo.test;

import java.util.Arrays;

public class Mergesort {

	public static void main(String[] args) {
		
//		int[] arr = {12,32,44,2,1,43};
//		System.out.println("Given array before sorting ");
//		 System.out.println(Arrays.toString(arr));
		int [] arr1 = {12,14,32,43,55};
		int [] arr2 = {1,3,14,67,77};
		int [] arr3 = new int[arr1.length+arr2.length];
		Merge(arr1,arr2,arr3);
		 System.out.println("Given array after sorting ");
	     System.out.println(Arrays.toString(arr3));
	}

	private static void Merge(int[] arr1, int[] arr2, int[] arr3) {
		int i=0; // for arr1
		int j=0; // for arr2
		int k=0; // arr3 sorted array
		
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]<arr2[j]) {
				arr3[k]=arr1[i];
				i++;
				k++;
			}else {
				arr3[k]=arr2[j];
				j++;
				k++;
			}
		}
		// bache kuche values in arr1 directly sorted array me daldo
		while(i<arr1.length) {
			arr3[k]=arr1[i];
			i++;
			k++;
		}
		// bache kuche values in arr2 directly sorted array me daldo
		while(j<arr2.length) {
			arr3[k]=arr2[j];
			j++;
			k++;
		}
		
	}

	

}
