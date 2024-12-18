package BinarySearch;

public class BinarySearchRecursion {

	public static void main(String[] args) {
		
		int[]arr= {1,2,3,4,5,6,7,8};
		
		int target= BinarySearchRec(arr, 7 ,0,arr.length-1);
		
		System.out.println(target);
	}
	private static int BinarySearchRec(int[] arr,int tar , int start , int end) {
		if (start > end) {
	        return -1;
	    }
		   int mid = (start+end)/2;	   
		   if(arr[mid]==tar) {
			   return mid;
		   }else if(arr[mid]>tar) {
			 return  BinarySearchRec(arr, tar, start, mid-1);
		   }else {
			  return BinarySearchRec(arr, tar, mid+1, end);
		   }
	}
}
