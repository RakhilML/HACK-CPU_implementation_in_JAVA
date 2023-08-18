package CPU.COMPONENTS;

public class REGISTER {
	public static int register(int prevout,int a,int load) {	
		 int t;
			
	    t = prevout;
		int stage1 = MUX.mux(t,a,load);
		t = DFF.dff(stage1,1);
		return t;
		}
}
