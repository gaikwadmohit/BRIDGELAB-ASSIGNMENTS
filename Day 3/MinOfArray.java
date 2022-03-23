package day3Assignment;

public class MinOfArray {

	public static void main(String[] args) {
	
		int [] arr = new int [] {35, 11, 17, 53, 61, 43, 94, 51, 32, 87};  
		int min = arr[0];  
		for (int i = 0; i < arr.length; i++) 
		{  
		if(arr[i] <min)  
		min = arr[i];  
		}  
		System.out.println("Smallest element present in given array: " + min);  
		}  
		}  
	


