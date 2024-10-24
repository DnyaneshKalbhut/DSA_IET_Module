
public class QuickSort {

	
	public static void swap(int[]arr,int i , int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	public static void partition(int[]arr) {
		int pivot = arr[0];
	     int start=0;
	     int end =arr.length-1;
		
		if(pivot>=start) {
			start++;
		}
		if(end>pivot) {
			end--;
		}
		if(end<pivot) {
			swap(arr,start,end);
		}
		if(end<start) {
			swap(arr,end,pivot);
		}
		
	}
	
	public static void QuickSort(int []arr) {
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		

	}

}
