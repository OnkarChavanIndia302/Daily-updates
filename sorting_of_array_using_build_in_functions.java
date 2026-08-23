package arr_search;

import java.util.Arrays;

public class sorting {
	
	public void sort(int arr[]) {
		System.out.println("before sorting...");
		System.out.println(Arrays.toString(arr));//printing array 
		
		Arrays.sort(arr);
		
		System.out.println("after sorting...");
		System.out.println(Arrays.toString(arr));
		
	}
	
	public static void main(String[] args) {
		sorting obj = new sorting () ;
		int arr[] = { 10,40,20,80,30,60,70};
		obj.sort(arr);
	}

}
