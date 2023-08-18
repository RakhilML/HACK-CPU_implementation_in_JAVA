package CPU.COMPONENTS;

import java.util.Scanner;

public class FULLADDER {
	public static int [] fullAdder(int a, int b, int c){
        int [] sumCarry = new int[2];
        int [] halfAdder1 = new int[2];
        int [] halfAdder2 = new int[2];
        halfAdder1 = HALFADDER.halfAdder(a,b);
        halfAdder2 = HALFADDER.halfAdder(halfAdder1[0],c);
        sumCarry [0] = halfAdder2[0];
        sumCarry [1] = Or.or(halfAdder1[1],halfAdder2[1]);
        return sumCarry;
}
	 public static void main(String[] args) {
	    	int a, b, c;
	        Scanner sc = new Scanner(System.in);
	        System.out.println("a =  ");
	        a = sc.nextInt();
	        
	        System.out.println("b =  ");
	        b = sc.nextInt();
	        
	        System.out.println("c =  ");
	        c = sc.nextInt();
	        
	        sc.close();
	        int [] sumCarry = new int[2];
	        int [] halfAdder1 = new int[2];
	        int [] halfAdder2 = new int[2];
	        halfAdder1 = HALFADDER.halfAdder(a,b);
	        halfAdder2 = HALFADDER.halfAdder(halfAdder1[0],c);
	        sumCarry [0] = halfAdder2[0];
	        sumCarry [1] = Or.or(halfAdder1[1],halfAdder2[1]);
	   
			System.out.println("sum = " +sumCarry[0]);
			System.out.println("carry = " +sumCarry[1]);
}
}
