package CPU.COMPONENTS;

public class Inc16 {
	int[] out;
	 
    public static int[] inc16(int[] a) {
 	   
 	   int tr[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1};

 	   int[] out = ADDER16.adder16(a, tr);
 	   return out;
    }
}
