package CPU.COMPONENTS;

import java.util.Scanner;

public class OR16WAY {
	 public static int or16Way(int [] in){
	        int a,b,c,d,e,f,g,h,i,j,k,l,m,n,out;
	        a = Or.or(in[0],in[1]);
	        b = Or.or(a,in[2]);
	        c = Or.or(b,in[3]);
	        d = Or.or(c,in[4]);
	        e = Or.or(d,in[5]);
	        f = Or.or(e,in[6]);
	        g = Or.or(f,in[7]);
	        h = Or.or(g,in[8]);
	        i = Or.or(h,in[9]);
	        j = Or.or(i,in[10]);
	        k = Or.or(j,in[11]);
	        l = Or.or(k,in[12]);
	        m = Or.or(l,in[13]);
	        n = Or.or(m,in[14]);
	        out = Or.or(n,in[15]);

	        return out;
}
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int [] in = new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1};
	        int a,b,c,d,e,f,g,h,i,j,k,l,m,n,out;
	        a = Or.or(in[0],in[1]);
	        b = Or.or(a,in[2]);
	        c = Or.or(b,in[3]);
	        d = Or.or(c,in[4]);
	        e = Or.or(d,in[5]);
	        f = Or.or(e,in[6]);
	        g = Or.or(f,in[7]);
	        h = Or.or(g,in[8]);
	        i = Or.or(h,in[9]);
	        j = Or.or(i,in[10]);
	        k = Or.or(j,in[11]);
	        l = Or.or(k,in[12]);
	        m = Or.or(l,in[13]);
	        n = Or.or(m,in[14]);
	        out = Or.or(n,in[15]);
	        sc.close();
	        System.out.println("out = " +out);
}
}
