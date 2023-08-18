package CPU.COMPONENTS;

import java.util.Scanner;

public class XOR {
	
	public static int xor(int a, int b){
        int aAndNotb, bAndNota;
        aAndNotb=AND.and(a,NOT.not(b));
        bAndNota=AND.and(b,NOT.not(a));
        return Or.or(aAndNotb,bAndNota);
}
	 public static void main(String[] args) {
	    	int a, b;
	        Scanner sc = new Scanner(System.in);
	        System.out.println("a =  ");
	        a = sc.nextInt();
	        
	        System.out.println("b =  ");
	        b = sc.nextInt();
	        
	        sc.close();
	        int aAndNotb, bAndNota;
	        aAndNotb=AND.and(a,NOT.not(b));
	        bAndNota=AND.and(b,NOT.not(a));
			System.out.println("out = " +Or.or(aAndNotb,bAndNota));
}
}

