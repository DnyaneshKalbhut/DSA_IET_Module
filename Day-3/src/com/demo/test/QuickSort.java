package com.demo.test;

import java.util.Arrays;

public class QuickSort {
	public static void main(String[] args) {
		 int [] arr = {12,3,23,45,1,43};
		 System.out.println("Given array before sorting ");
		 System.out.println(Arrays.toString(arr));
		 quickSort(arr,0,arr.length-1);
		 System.out.println("Given array after sorting ");
	     System.out.println(Arrays.toString(arr));	
	}
	
public static void quickSort(int[] arr , int start , int last) {
		int i = start;
		int pivot = start;
		int j = last;
		if(start<last) {
		while(i<j) {
			while(arr[i]<=arr[pivot] && i<last) {
				i++;
			}
			while(arr[j]>arr[pivot] && j>pivot) {
				j--;
			}
			if(i<j) {
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}			
		}
		int temp = arr[j];
		arr[j]=arr[pivot];
		arr[pivot]=temp;
		quickSort(arr,start,j-1);
		quickSort(arr,j+1,last);
	}
	
	}


}
