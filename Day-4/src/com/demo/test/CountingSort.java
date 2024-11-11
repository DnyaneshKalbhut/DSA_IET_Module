package com.demo.test;

import java.util.Arrays;

public class CountingSort {

	public static void main(String[] args) {
		int[] arr = {4,2,2,8,3,3,1};
		System.out.println("Given array before sorting ");
		System.out.println(Arrays.toString(arr));
		countingSort(arr);
		System.out.println("Given array after sorting ");
	    System.out.println(Arrays.toString(arr));
}
	

	private static void countingSort(int [] arr) {
		int max = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
	
		int[] countArr = new int[max+1];
		
		for(int i = 0; i<arr.length; i++) {
			countArr[arr[i]]++;
		}
		
		 for(int i = 1; i < countArr.length; i++) {
	        countArr[i] += countArr[i - 1];
	       }
		 
	    int[] outputArr = new int[arr.length];
	     for (int i = arr.length - 1; i >= 0; i--) {
	            int val = arr[i];
	            outputArr[countArr[val] - 1] = val;
	            countArr[val]--;
	        }
	        for (int i = 0; i < arr.length; i++) {
	            arr[i] = outputArr[i];
	        }
	}}

