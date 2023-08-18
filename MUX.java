package CPU.COMPONENTS;

import java.util.Scanner;

public class MUX 
{
	    public static int mux(int a, int b, int sel){
	    	 int notSel, aAndNotSel, bAndSel;
		        notSel=NOT.not(sel);
		        aAndNotSel=AND.and(a,notSel);
		        bAndSel=AND.and(b,sel);
        return Or.or(aAndNotSel,bAndSel);
   }
	    public static void main(String[] args) {
	    	int a, b, sel;
	        Scanner sc = new Scanner(System.in);
	        System.out.println("a =  ");
	        a = sc.nextInt();
	        
	        System.out.println("b =  ");
	        b = sc.nextInt();
	        
	        System.out.println("sel =  ");
	        sel = sc.nextInt();
	        
	        sc.close();
	        int notSel, aAndNotSel, bAndSel;
	        notSel=NOT.not(sel);
	        aAndNotSel=AND.and(a,notSel);
	        bAndSel=AND.and(b,sel);
			System.out.println("out = " +Or.or(aAndNotSel,bAndSel));
}
}

