import java.util.Arrays;

public class ArrayServices {

	public static int findMax(int[] arr) {
		int max = arr[0];
		
		for(int i = 1; i<arr.length;i++ ) {
		if(arr[i]>max) {
			max=arr[i];
		}
	}
		return max;
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

	public static int findSecondLargest(int[] arr) {
		BubbleSort(arr);		
		return arr[arr.length - 2];
	}
	
	
	public static void BubbleSort(int[] arr) {
		
		for(int i = 0; i< arr.length ; i++) {
			for(int j = 0 ;j<arr.length - i -1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	
	}
