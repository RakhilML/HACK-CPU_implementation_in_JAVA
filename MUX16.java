package CPU.COMPONENTS;

import java.util.Scanner;

public class MUX16 {
	public static int [] mux16(int [] a, int [] b, int sel){
		 
        int [] mux = new int[16];
        for (int i = 0; i < a.length; i++){
            mux[i] = MUX.mux(a[i], b[i], sel);
        }
        return mux;

}
	 public static void main(String[] args) {
	    	int sel;
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.println("sel =  ");
	        sel = sc.nextInt();
	        
	        sc.close();
	        int [] mux = new int[16];
	        int [] a = new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
	        int [] b = new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1};
//	        System.out.println(a);
	        
	        for (int i = 0; i < a.length; i++) {
	        	 mux[i] = MUX.mux(a[i], b[i], sel);
	        	 System.out.println("Out"+ i+ "=" + mux[i]);
	        }
	       
	         
	 }
}
