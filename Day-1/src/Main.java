
public class Main {

	public static void main(String[] args) {
	
		int[]arr = {1,2,3,4,5};
		
       	int max=ArrayServices.findMax(arr);
		System.out.println(max);	
		
		int min = ArrayServices.findMin(arr);
		System.out.println(min);	
		
		int s = ArrayServices.findSecondLargest(arr);
		System.out.println(s);
	}

}
