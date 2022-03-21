package FIRSTPROJECT;

import java.util.Scanner;

public class LeapYearOrNot {

	public static void main(String[] args) {
		
		
		int year;
		Scanner s = new Scanner(System.in);
		
		System.out.println(" Please Enter any year ");
		year = s.nextInt();
		
		if (( year%400 == 0)|| (( year%4 == 0 ) &&( year%100 != 0))) 
		{
			System.out.format(year + " is a leap year");
		}
		else {
			System.out.format(year + " is not a leap year");
		}
	}
}
	


