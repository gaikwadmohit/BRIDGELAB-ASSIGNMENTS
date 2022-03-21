package FIRSTPROJECT;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("Please enter candidte age:");
		int age=scan.nextInt();
		if(age>=18) {
			System.out.print("Candidate can give vote");
		}else {
			System.out.println("candidate should complete 18 years");
			scan.close();		}
	}

}
