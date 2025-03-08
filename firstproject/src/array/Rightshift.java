package array;

import java.util.Arrays;

public class Rightshift {

	    public static void main(String[] args) {
	        int[] arr = {10, 20, 30, 40, 70}; 
	        int[] result = rearrangeArray(arr);
	        
	        System.out.println("Rearranged Array: " + Arrays.toString(result));
	    }

	    public static int[] rearrangeArray(int[] arr) {
	        if (arr.length < 3) {
	        }

	        int[] newArr = new int[arr.length];
	        
	        newArr[0] = arr[arr.length-2];

	        newArr[1] = arr[arr.length - 1];

	        int index = 2;
	        for (int i = 0; i <arr.length; i++) {
	            if (i !=arr.length-2 && i != arr.length - 1) { 
	                newArr[index++] = arr[i];
	            }
	        }
	        return newArr;
	    }
	}

