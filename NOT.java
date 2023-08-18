package CPU.COMPONENTS;

import java.util.Scanner;

public class NOT {
	public static int not (int a){
        return NAND.nand(a,a);
    }
    public static void main(String[] args) {
    	int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("a =  ");
        a = sc.nextInt();
       
        sc.close();
        System.out.println("out = " +NAND.nand(a,a));
	}
}                              
