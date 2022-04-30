package kr.co.ezen.run;

import kr.co.ezen.variable.A_variable;
import kr.co.ezen.variable.B_Constant;
import kr.co.ezen.variable.C_keyboardInput;
import kr.co.ezen.variable.D_Cast;
import kr.co.ezen.variable.E_Printf;

public class Run {

	public static void main(String[] args) {
		A_variable av=new A_variable(); // °´Ã¼»ý¼º
		//av.declareVariable();
		//av.declareVariable2();
		//av.charVariable();
		
		B_Constant bc=new B_Constant();
		//bc.finalConstant();
		
		C_keyboardInput ck=new C_keyboardInput();
		//ck.inputScanner1();
		//ck.inputScanner2();
		//ck.inputScanner3();
		
		D_Cast ect=new D_Cast();
		//ect.rules1();
		//ect.rules2();
		//ect.rules3();
		
		E_Printf fpf=new E_Printf();
		fpf.printMethod();
		
	}

}

