package Day2Assignments;

import java.util.Scanner;

public class SumOfNaturalNumber {

	public static void main(String[] args) {
		int sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any number");
		int n=s.nextInt();
		for (int i=1;i<=n;i++)
		{
			sum=sum+i;
		}
System.out.println("Sum of natural number is " + sum);
	}

}
