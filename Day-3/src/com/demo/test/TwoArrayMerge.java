package com.demo.test;

import java.util.Arrays;

public class TwoArrayMerge {

	public static void main(String[] args) {
		int [] arr1 = {4,6,11,12,21};
		int [] arr2 = {1,3,7,9,17};
		System.out.println("AFter merge sort");
		int [] arr3 = Merge(arr1,arr2);
		System.out.println(Arrays.toString(arr3));

	}

	private static int[] Merge(int[] arr1, int[] arr2) {
		int [] arr3 = new int[arr1.length+arr2.length];
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
		return arr3;
		
	}
}
