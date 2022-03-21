package FIRSTPROJECT;

public class StaticVariableMethodBlock {
	
		static int a = 20;
		   static int b;
		   static void func(int c) {
		      System.out.println( a);
		      System.out.println( b);
		      System.out.println( c);
		   }
		   
		   static {
		      System.out.println("Print static block");
		      b = a + 10;
		   }
		   public static void main(String args[]) {
		      func(5);
		   }
		}
	


