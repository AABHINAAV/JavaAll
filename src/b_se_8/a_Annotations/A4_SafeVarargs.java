package b_se_8.a_Annotations;

import java.util.*;

public class A4_SafeVarargs {
	@SafeVarargs
//	@SuppressWarnings("all")
	final void display(List<String>... p) {
		for(List<String> x : p) {
			System.out.println(x);
		}
	}
	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		l.add("a");
		l.add("b");
		A4_SafeVarargs obj = new A4_SafeVarargs();
		obj.display(l);
	}
}