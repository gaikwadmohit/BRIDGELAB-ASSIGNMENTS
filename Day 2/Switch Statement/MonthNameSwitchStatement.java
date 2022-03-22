package Day2Assignments;

import java.util.Scanner;

public class MonthNameSwitchStatement {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num ;
		 Scanner s=new Scanner(System.in);
		 System.out.println("Enter any month number");
		 num=s.nextInt();
		 

	        switch (num) {
	            case 1:
	            	System.out.println("Jan");
	            	break;
	            case 2:
	            	System.out.println("feb");
	            	break;
	            case 3:
	            	System.out.println("mar");
	            	break;
	            case 4:
	            	System.out.println("apr");
	            	break;
	            case 5:
	            	System.out.println("may");
	            	break;
	            case 6:
	            	System.out.println("Jun");
	            	break;
	            case 7:
	            	System.out.println("Jul");
	            	break;
	            case 8:
	            	System.out.println("aug");
	            	break;
	            case 9:
	            	System.out.println("sep");
	            	break;
	            case 10:
	            	System.out.println("oct");
	            	break;
	            case 11:
	            	System.out.println("Nov");
	            	break;
	            case 12:
	            	System.out.println("Dec");
	            	break;
	        
	            default:
	                System.out.println("Invalid Month Number");
	        }
	    }
	}



