package CPU.COMPONENTS;

public class Register16 {
int[] out;
	
	public static int[] register16(int[] prevout, int[] in, int load) {

		int[] out = new int[16];
        for (int i=0; i<=15; i++) {
        	out[i]= REGISTER.register(prevout[i],in[i],load);}
        return out;
	}
}
