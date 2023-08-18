package CPU.COMPONENTS;

public class DFF16 {
	int[] out;

	public static int[] dff16(int[] data, int clk) {

        int[] out = new int[16];
        for (int i=0; i<=15; i++) {
        	out[i]=DFF.dff(data[i],clk);
        }
        return out;
	
  }
}
