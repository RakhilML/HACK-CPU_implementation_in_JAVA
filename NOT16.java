package CPU.COMPONENTS;

import java.util.Scanner;

public class NOT16 {
	public static int [] not16(int [] in){
        int [] a = new int[16];
        System.arraycopy(in, 0, a, 0, a.length);
        int [] not = new int[16];
        for (int i = 0; i < a.length; i++){
            not[i] = NOT.not(in[i]);
        }
        return not;
}
	 public static void main(String[] args) {
	    
	        Scanner sc = new Scanner(System.in);
	        
	        sc.close();
	        int [] a = new int[16];
	        int [] in = new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1};
//	        System.out.println(a);
	        
	        int [] not = new int[16];
	        for (int i = 0; i < a.length; i++){
	            not[i] = NOT.not(in[i]);
	        	 System.out.println("Out"+ i+ "=" + not[i]);
	        }
}
}
