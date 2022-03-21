package Day2Assignments;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
//		Write a Program to reverse the integer number eg. Input n=231 reverse is 132
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any number");
		int num=s.nextInt();
		while(num>0)
		{
			int rem=num%10;
			System.out.print( rem);
			num=num/10;
		}
	}

}
