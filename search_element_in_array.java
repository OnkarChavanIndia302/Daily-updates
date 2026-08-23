package arr_search;

public class arr_search {

	public void sarch(int arr[],int temp) {
//		int temp = 50 ;
		boolean status = false ;
		
		for (int row = 0 ; row<arr.length;row++) {
			if (temp ==arr[row]) {
				System.out.println("element found at index "+row+" ");
				status =  true ;
				break ;
				
			}	
			
		}	
		if (status==false) {
		System.out.println("element not found ");
		}
	}
	
	public void srch(int arr[] , int temp) {
		
		boolean status = false ;
		
		for (int x:arr) {
			if (x== temp ) {
				System.out.println("element found ");
				status = true ;
				break ;
				
				
			}
		}
		if (status==false) {
			System.out.println("element not found"); 
			
		}
		
	}
	
	public static void main(String[] args) {
		arr_search obj = new arr_search () ;
		int arr[] = {10,20,30,40,50,60,70,80,90} ;
		int temp = 60 ;
//		obj.sarch(arr,temp);
		obj.srch(arr, temp);
		
		
		
	}
	
}
