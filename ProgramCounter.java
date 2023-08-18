package CPU.COMPONENTS;

public class ProgramCounter {
int[] FBout;
    
    public static int[] pc(int[] in, int load, int inc, int reset) {
  	  
  	  int fl[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}; 
  	  int prevout[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}; 
  	  int FBout[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
  	  
  	  int regload = Or3input.or3input(inc, load, reset);
  	  int[] incout = Inc16.inc16(FBout);
  	  int[] w0 = MUX16.mux16(FBout, incout, inc);
  	  int[] w1 = MUX16.mux16(w0, in, load);
  	  int[] cout = MUX16.mux16(w1, fl, reset);
        FBout = Register16.register16(prevout,cout,regload);
        
        return FBout;
    
}
}