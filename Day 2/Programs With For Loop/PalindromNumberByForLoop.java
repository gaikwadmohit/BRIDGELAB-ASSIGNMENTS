package Day2Assignments;

import java.util.Scanner;

public class PalindromNumberByForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=0,c=0;
		Scanner p=new Scanner(System.in);
		System.out.println("Enter any number");
		int s=p.nextInt();
		c=s;
		for( ; s!=0;)
		{
			n=n*10;
			n=n+s%10;
		
			s=s/10;
		}
		if(c==n)
		{
		System.out.println("Given number is palindrom number");
		}
		else
		{
			System.out.println("Given number is not palindrom number");
		}
}
		

}
