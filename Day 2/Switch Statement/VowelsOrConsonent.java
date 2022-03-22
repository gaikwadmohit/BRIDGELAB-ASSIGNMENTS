package Day2Assignments;

import java.util.Scanner;

public class VowelsOrConsonent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 char ch ;
		 Scanner s=new Scanner(System.in);
		 System.out.println("Enetr any character");
		 ch=s.next().charAt(0);
		 

	        switch (ch) {
	            case 'a':
	            case 'e':
	            case 'i':
	            case 'o':
	            case 'u':
	                System.out.println(ch + " is vowel");
	                break;
	            default:
	                System.out.println(ch + " is consonant");
	        }
	    }
	}


