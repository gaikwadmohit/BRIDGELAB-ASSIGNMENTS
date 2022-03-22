package Day2Assignments;

import java.util.Scanner;

public class ReverseNoFOrLoop {
	
public static void main(String[] args) {
		
//		Write a Program to reverse the integer number eg. Input n=231 reverse is 132
		int num=0;
		Scanner p=new Scanner(System.in);
		System.out.println("Enter any number");
		int s=p.nextInt();
		for( ; s!=0;)
		{
			num=num*10;
			num=num+s%10;
			
			
			s=s/10;
		}
		System.out.println(num);	
}

}


