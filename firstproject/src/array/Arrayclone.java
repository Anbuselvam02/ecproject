package array;

public class Arrayclone {
	public static void main(String[]args) {
		int[][]arr={ {1,3,5},{3,7}};
		
		int[][]arr2= arr.clone();
		
		
		System.out.println(arr==arr2);
		
		System.out.println(arr[0]==arr2[0]);
		System.out.println(arr[1]==arr2[1]);


		
	}

}
