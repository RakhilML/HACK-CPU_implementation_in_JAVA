package CPU.COMPONENTS;

	import java.util.Arrays;

	public class CPU {
	public int[] outM(int[] inM,int[] instruction,int reset) {
			
			int outtM[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}; 
			int[] prevout = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
			
			int ni = NOT.not(instruction[0]);
			int[] i = MUX16.mux16(outtM, instruction, ni); 
			int intoA = Or.or(instruction[10], ni);
			int[] A = Register16.register16(prevout, i, intoA);
			int AorM = AND.and(instruction[15], instruction[12]);
			int[] AM = MUX16.mux16(A,inM,AorM);
			
			int intoD = AND.and(instruction[0],instruction[12]);
			int[] D = Register16.register16(prevout,outtM,intoD);
			
			
			int[] outM = ALU.alu( instruction[4], instruction[5],instruction[6], instruction[7], instruction[8],instruction[9], D, AM);
			int zr = ALU.zr( instruction[4], instruction[5],instruction[6], instruction[7], instruction[8],instruction[9], D, AM);
			int ng = ALU.ng( instruction[4], instruction[5],instruction[6], instruction[7], instruction[8],instruction[9],D, AM);
			
			int writeM = AND.and(instruction[0], instruction[12]);
			
			int pos  = NOT.not(ng);
			int nzr = NOT.not(zr);
			int jgt = AND.and(instruction[0], instruction[15]);
			int posnzr = AND.and(pos, jgt);
			int ld1 = AND.and(jgt, posnzr);
			
			int jeq = AND.and(instruction[0], instruction[14]);
			int ld2 = AND.and(jgt, zr);
			
			int jlt = AND.and(instruction[0], instruction[13]);
			int ld3 = AND.and(jlt, ng);
			
			int ldt = Or.or(ld1, ld2);
			int ld = Or.or(ld3, ldt);
			
			int[] out = ProgramCounter.pc(A, ld, 1, reset);
			
			int[] addressM = Arrays.copyOfRange(A,1,15);
			int[] pc = Arrays.copyOfRange(out, 1, 15);
			
			return outM;
			
			
		}
		
	public int writeM(int[] inM,int[] instruction,int reset) {
			
			int outtM[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}; 
			int[] prevout = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
			
			int ni = NOT.not(instruction[0]);
			int[] i = MUX16.mux16(outtM, instruction, ni); 
			int intoA = Or.or(instruction[10], ni);
			int[] A = Register16.register16(prevout, i, intoA);
			int AorM = AND.and(instruction[15], instruction[12]);
			int[] AM = MUX16.mux16(A,inM,AorM);
			
			int intoD = AND.and(instruction[0],instruction[12]);
			int[] D = Register16.register16(prevout,outtM,intoD);
			
			int[] outM = ALU.alu( instruction[4], instruction[5],instruction[6], instruction[7], instruction[8],instruction[9], D, AM);
			int zr = ALU.zr( instruction[4], instruction[5],instruction[6], instruction[7], instruction[8],instruction[9], D, AM);
			int ng = ALU.ng( instruction[4], instruction[5],instruction[6], instruction[7], instruction[8],instruction[9],D, AM);
			
			int writeM = AND.and(instruction[0], instruction[12]);
			
			int pos  = NOT.not(ng);
			int nzr = NOT.not(zr);
			int jgt = AND.and(instruction[0], instruction[15]);
			int posnzr = AND.and(pos, jgt);
			int ld1 = AND.and(jgt, posnzr);
			
			int jeq = AND.and(instruction[0], instruction[14]);
			int ld2 = AND.and(jgt, zr);
			
			int jlt = AND.and(instruction[0], instruction[13]);
			int ld3 = AND.and(jlt, ng);
			
			int ldt = Or.or(ld1, ld2);
			int ld = Or.or(ld3, ldt);
			
			int[] out = ProgramCounter.pc(A, ld, 1, reset);
			
			int[] addressM = Arrays.copyOfRange(A,1,15);
			int[] pc = Arrays.copyOfRange(out, 1, 15);
			
			return writeM;
			
			
		}

	public int[] addressM(int[] inM,int[] instruction,int reset) {
		
		int outtM[] =   {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}; 
		int[] prevout = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		
		int ni = NOT.not(instruction[0]);
		int[] i = MUX16.mux16(outtM, instruction, ni); 
		int intoA = Or.or(instruction[10], ni);
		int[] A = Register16.register16(prevout, i, intoA);
		int AorM = AND.and(instruction[15], instruction[12]);
		int[] AM = MUX16.mux16(A,inM,AorM);
		
		int intoD = AND.and(instruction[0],instruction[12]);
		int[] D = Register16.register16(prevout,outtM,intoD);
		
		int[] outM = ALU.alu( instruction[4], instruction[5],instruction[6], instruction[7], instruction[8],instruction[9], D, AM);
		int zr = ALU.zr( instruction[4], instruction[5],instruction[6], instruction[7], instruction[8],instruction[9], D, AM);
		int ng = ALU.ng( instruction[4], instruction[5],instruction[6], instruction[7], instruction[8],instruction[9],D, AM);
		
		int writeM = AND.and(instruction[0], instruction[12]);
		
		int pos  = NOT.not(ng);
		int nzr = NOT.not(zr);
		int jgt = AND.and(instruction[0], instruction[15]);
		int posnzr = AND.and(pos, jgt);
		int ld1 = AND.and(jgt, posnzr);
		
		int jeq = AND.and(instruction[0], instruction[14]);
		int ld2 = AND.and(jgt, zr);
		
		int jlt = AND.and(instruction[0], instruction[13]);
		int ld3 = AND.and(jlt, ng);
		
		int ldt = Or.or(ld1, ld2);
		int ld = Or.or(ld3, ldt);
		
		int[] out = ProgramCounter.pc(A, ld, 1, reset);
		
		int[] addressM = Arrays.copyOfRange(A,1,16);
		int[] pc = Arrays.copyOfRange(out, 1, 16);
		
		return addressM;
		
		
	}

	public int[] pc(int[] inM,int[] instruction,int reset) {
		
		int outtM[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}; 
		int[] prevout = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		
		int ni = NOT.not(instruction[0]);
		int[] i = MUX16.mux16(outtM, instruction, ni); 
		int intoA = Or.or(instruction[10], ni);
		int[] A = Register16.register16(prevout, i, intoA);
		int AorM = AND.and(instruction[15], instruction[12]);
		int[] AM = MUX16.mux16(A,inM,AorM);
		
		int intoD = AND.and(instruction[0],instruction[12]);
		int[] D = Register16.register16(prevout,outtM,intoD);
		
		int[] outM = ALU.alu( instruction[4], instruction[5],instruction[6], instruction[7], instruction[8],instruction[9], D, AM);
		int zr = ALU.zr( instruction[4], instruction[5],instruction[6], instruction[7], instruction[8],instruction[9], D, AM);
		int ng = ALU.ng( instruction[4], instruction[5],instruction[6], instruction[7], instruction[8],instruction[9],D, AM);
		
		int writeM = AND.and(instruction[0], instruction[12]);
		
		int pos  = NOT.not(ng);
		int nzr = NOT.not(zr);
		int jgt = AND.and(instruction[0], instruction[15]);
		int posnzr = AND.and(pos, jgt);
		int ld1 = AND.and(jgt, posnzr);
		
		int jeq = AND.and(instruction[0], instruction[14]);
		int ld2 = AND.and(jgt, zr);
		
		int jlt = AND.and(instruction[0], instruction[13]);
		int ld3 = AND.and(jlt, ng);
		
		int ldt = Or.or(ld1, ld2);
		int ld = Or.or(ld3, ldt);
		
		int[] out = ProgramCounter.pc(A, ld, 1, reset);
		
		int[] addressM = Arrays.copyOfRange(A,1,16);
		int[] pc = Arrays.copyOfRange(out, 1, 16);
		
		return pc;
		
		
	}

	public static void main(String[] args) {
	CPU Cpu = new CPU();

	int a[] =   {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
	int inM[] = {0,1,1,1,1,1,1,1,0,1,0,1,0,1,1,0};

	int[] outM = Cpu.outM(inM,a,0);
	int writeM = Cpu.writeM(inM,a,0);
	int[] addressM = Cpu.addressM(inM,a,0);
	int[] pc = Cpu.pc(inM,a,0);

	System.out.println("The value of outM is");

	for (int i=0;i<=15;i++) {
		   System.out.print(outM[i]);}

	System.out.println("\n"+"The value of writeM is");

	System.out.println(writeM);

	System.out.println("The value of addressM is");

	for (int i=0;i<=14;i++) {
		   System.out.print(addressM[i]);}

	System.out.println("\n"+"The value of pc is");

	for (int i=0;i<=14;i++) {
		   System.out.print(pc[i]);}
	  }
	}



