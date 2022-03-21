package Day2Assignments;

import java.util.Scanner;

public class SumOFNaturalNumberForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any Favourite number");
		int n=s.nextInt();
		
		
		for(int i=1;i<=n;i++) {
			sum=sum+i;
		}
			System.out.println(sum);
		}
	

}
