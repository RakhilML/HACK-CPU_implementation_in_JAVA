package CPU.COMPONENTS;

import java.util.Scanner;

public class OR16 {
	 public static int [] or16(int [] a, int [] b){

	        int [] or = new int[16];

	        for (int i = 0; i < a.length; i++){
	            or[i] = Or.or(a[i], b[i]);
	        }
	        return or;
}
	 public static void main(String[] args) {
		 
	        Scanner sc = new Scanner(System.in);
	        
	        sc.close();
	        int [] or = new int[16];
	        int [] a = new int[]{0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,0};
	        int [] b = new int[]{1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0};
//	        System.out.println(a);
	        
	        for (int i = 0; i < a.length; i++){
	            or[i] = Or.or(a[i], b[i]);
	        	 System.out.println("Out"+ i+ "=" + or[i]);
	        }
	       
	         
	 }
}
