package arr_search;



public class count_ele {
	
	public void countt(int arr[] , int count_ele) {
		
		
		int count = 0 ;
		for(int row = 0 ; row<arr.length;row++) {
			if(arr[row] == count_ele) {
				count += 1;
				
			}
			
		}
		System.out.println("element fount in times "+count);
		
	}
	public static void main(String[] args) {
		count_ele obj = new count_ele();
		int arr [] = {10 ,20,30,10,40,50,10,80,10};
		obj.countt(arr, 10);
		
	}

}
