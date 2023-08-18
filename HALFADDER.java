package CPU.COMPONENTS;

import java.util.Scanner;

public class HALFADDER {
	 public static int [] halfAdder(int a, int b){
	        int [] sumCarry = new int[2];
	        sumCarry[0] = XOR.xor(a,b);
	        sumCarry[1] = AND.and(a,b);
	        return sumCarry;
}
	 public static void main(String[] args) {
	    	int a, b;
	        Scanner sc = new Scanner(System.in);
	        System.out.println("a =  ");
	        a = sc.nextInt();
	        
	        System.out.println("b =  ");
	        b = sc.nextInt();
	        
	        sc.close();
	        int [] sumCarry = new int[2];
	        sumCarry[0] = XOR.xor(a,b);
	        sumCarry[1] = AND.and(a,b);
			System.out.println("sum = " +sumCarry[0]);
			System.out.println("carry = " +sumCarry[1]);
}

}

