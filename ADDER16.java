package CPU.COMPONENTS;

import java.util.Scanner;

public class ADDER16 {
	public static int [] adder16(int [] a, int [] b){
        int [] f0 = new int [2];
        int [] f1 = new int [2];
        int [] f2 = new int [2];
        int [] f3 = new int [2];
        int [] f4 = new int [2];
        int [] f5 = new int [2];
        int [] f6 = new int [2];
        int [] f7 = new int [2];
        int [] f8 = new int [2];
        int [] f9 = new int [2];
        int [] f10 = new int [2];
        int [] f11 = new int [2];
        int [] f12 = new int [2];
        int [] f13 = new int [2];
        int [] f14 = new int [2];
        int [] f15 = new int [2];
        int [] f16 = new int [16];

        f0 = FULLADDER.fullAdder(a[15], b[15], 0);
        f1 = FULLADDER.fullAdder(a[14], b[14], f0[1]);
        f2 = FULLADDER.fullAdder(a[13], b[13], f1[1]);
        f3 = FULLADDER.fullAdder(a[12], b[12], f2[1]);
        f4 = FULLADDER.fullAdder(a[11], b[11], f3[1]);
        f5 = FULLADDER.fullAdder(a[10], b[10], f4[1]);
        f6 = FULLADDER.fullAdder(a[9], b[9], f5[1]);
        f7 = FULLADDER.fullAdder(a[8], b[8], f6[1]);
        f8 = FULLADDER.fullAdder(a[7], b[7], f7[1]);
        f9 = FULLADDER.fullAdder(a[6], b[6], f8[1]);
        f10 = FULLADDER.fullAdder(a[5], b[5], f9[1]);
        f11 = FULLADDER.fullAdder(a[4], b[4], f10[1]);
        f12 = FULLADDER.fullAdder(a[3], b[3], f11[1]);
        f13 = FULLADDER.fullAdder(a[2], b[2], f12[1]);
        f14 = FULLADDER.fullAdder(a[1], b[1], f13[1]);
        f15 = FULLADDER.fullAdder(a[0], b[0], f14[1]);

        
        f16[0] = f15[0];
        f16[1] = f14[0];
        f16[2] = f13[0];
        f16[3] = f12[0];
        f16[4] = f11[0];
        f16[5] = f10[0];
        f16[6] = f9[0];
        f16[7] = f8[0];
        f16[8] = f7[0];
        f16[9] = f6[0];
        f16[10] = f5[0];
        f16[11] = f4[0];
        f16[12] = f3[0];
        f16[13] = f2[0];
        f16[14] = f1[0];
        f16[15] = f0[0];
        return f16;
}
	 public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
	        
	        sc.close();
	        int [] f0 = new int [2];
	        int [] f1 = new int [2];
	        int [] f2 = new int [2];
	        int [] f3 = new int [2];
	        int [] f4 = new int [2];
	        int [] f5 = new int [2];
	        int [] f6 = new int [2];
	        int [] f7 = new int [2];
	        int [] f8 = new int [2];
	        int [] f9 = new int [2];
	        int [] f10 = new int [2];
	        int [] f11 = new int [2];
	        int [] f12 = new int [2];
	        int [] f13 = new int [2];
	        int [] f14 = new int [2];
	        int [] f15 = new int [2];
	        int [] f16 = new int [16];
	        
	        int [] a = new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1};
	        int [] b = new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1};
	        
	        f0 = FULLADDER.fullAdder(a[15], b[15], 0);
	        f1 = FULLADDER.fullAdder(a[14], b[14], f0[1]);
	        f2 = FULLADDER.fullAdder(a[13], b[13], f1[1]);
	        f3 = FULLADDER.fullAdder(a[12], b[12], f2[1]);
	        f4 = FULLADDER.fullAdder(a[11], b[11], f3[1]);
	        f5 = FULLADDER.fullAdder(a[10], b[10], f4[1]);
	        f6 = FULLADDER.fullAdder(a[9], b[9], f5[1]);
	        f7 = FULLADDER.fullAdder(a[8], b[8], f6[1]);
	        f8 = FULLADDER.fullAdder(a[7], b[7], f7[1]);
	        f9 = FULLADDER.fullAdder(a[6], b[6], f8[1]);
	        f10 = FULLADDER.fullAdder(a[5], b[5], f9[1]);
	        f11 = FULLADDER.fullAdder(a[4], b[4], f10[1]);
	        f12 = FULLADDER.fullAdder(a[3], b[3], f11[1]);
	        f13 = FULLADDER.fullAdder(a[2], b[2], f12[1]);
	        f14 = FULLADDER.fullAdder(a[1], b[1], f13[1]);
	        f15 = FULLADDER.fullAdder(a[0], b[0], f14[1]);
	        
	        f16[0] = f15[0];
	        f16[1] = f14[0];
	        f16[2] = f13[0];
	        f16[3] = f12[0];
	        f16[4] = f11[0];
	        f16[5] = f10[0];
	        f16[6] = f9[0];
	        f16[7] = f8[0];
	        f16[8] = f7[0];
	        f16[9] = f6[0];
	        f16[10] = f5[0];
	        f16[11] = f4[0];
	        f16[12] = f3[0];
	        f16[13] = f2[0];
	        f16[14] = f1[0];
	        f16[15] = f0[0];
	        
	        for (int i = 0; i < a.length; i++)
	   
			System.out.println("Out"+ i+ "=" + f16[i]);
			
}
}


