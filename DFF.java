package CPU.COMPONENTS;

public class DFF {
	public static int dff(int data, int clk) {

		clk = 1;
		int Sout = NAND.nand(data,clk);
		int Notout = NOT.not(data);
		
	    int Rout = NAND.nand(clk, Notout);
	    int Q = 0;
	    int notQ = NAND.nand(Rout, Q);
	    Q = NAND.nand(Sout, notQ);
	    
	    return Q;
		
	}

}
