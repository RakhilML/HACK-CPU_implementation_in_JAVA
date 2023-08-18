package CPU.COMPONENTS;

public class OR8WAY {
	int out;
	public static int or8way(int [] in){
        int a,b,c,d,e,f,out;

        a = Or.or(in[0],in[1]);
        b = Or.or(a,in[2]);
        c = Or.or(b,in[3]);
        d = Or.or(c,in[4]);
        e = Or.or(d,in[5]);
        f = Or.or(e,in[6]);
        out = Or.or(f,in[7]);
        
       return out;
        
    }
}
