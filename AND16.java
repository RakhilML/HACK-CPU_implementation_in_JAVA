package CPU.COMPONENTS;

import java.util.Scanner;

public class AND16 {
	 public static int [] and16(int [] a, int [] b){

	        int [] and = new int[16];

	        for (int i = 0; i < a.length; i++){
	            and[i] = AND.and(a[i], b[i]);
	        }
	        return and;
}
	 public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
	        
	        sc.close();
	        int [] and = new int[16];
	        int [] a = new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0};
	        int [] b = new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1};
//	        System.out.println(a);
	        
	        for (int i = 0; i < a.length; i++) {
	        	and[i] = AND.and(a[i], b[i]);
	        	 System.out.println("Out"+ i+ "=" + and[i]);
	        }
}
}