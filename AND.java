package CPU.COMPONENTS;

import java.util.Scanner;

public class AND {
	public static int and(int a, int b)
	{
        return NOT.not(NAND.nand(a,b));
        }
	 public static void main(String[] args) {
	    	int a, b;
	        Scanner sc = new Scanner(System.in);
	        System.out.println("a =  ");
	        a = sc.nextInt();
	        
	        System.out.println("b =  ");
	        b = sc.nextInt();
	        
	        sc.close();
	        System.out.println("out = " +NOT.not(NAND.nand(a,b)));
	 }  
	        
   }

