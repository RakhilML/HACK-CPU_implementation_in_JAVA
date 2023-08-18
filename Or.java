package CPU.COMPONENTS;

import java.util.Scanner;

public class Or 
{
	/**
	 * A bitwise 1-bit Or gate.
	 */
	public static int or(int a, int b)
	{
	       return NAND.nand(NOT.not(a), NOT.not(b));
	  
    }
	 public static void main(String[] args) {
	    	int a, b;
	        Scanner sc = new Scanner(System.in);
	        System.out.println("a =  ");
	        a = sc.nextInt();
	        
	        System.out.println("b =  ");
	        b = sc.nextInt();
	        
	        sc.close();
	        System.out.println("out = " +NAND.nand(NOT.not(a), NOT.not(b)));
}
}

