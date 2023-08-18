package CPU.COMPONENTS;

public class Or3input {
	int out;

    public static int or3input(int a,int b,int c) {

  	  int t1 = Or.or(a, b);
  	  int out = Or.or(t1, c);
  	  return out;
    }
}
