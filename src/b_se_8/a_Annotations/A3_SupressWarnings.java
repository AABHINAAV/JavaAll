package b_se_8.a_Annotations;

import java.util.*;

public class A3_SupressWarnings {
	
	@SuppressWarnings("unused")
	public void method1() {
		List<String> lst = new ArrayList<>();
		// was throwing warning for unused code
	}
	
	@SuppressWarnings("unchecked")
	public void method2() {
		Object list = List.of("a", "b");
		List<Integer> actualList = (List<Integer>) list;
		System.out.println(actualList);
	}
	
	@Deprecated
	public void deprecatedMethod() {}
	
	@SuppressWarnings("deprecation")
	public void method3() {
		this.deprecatedMethod();
	}
	
	@SuppressWarnings({"unchecked", "unused"})
	public void method4() {
		Object list = List.of("a", "b");
		List<Integer> actualList = (List<Integer>) list;
		System.out.println(actualList);

		List<String> lst = new ArrayList<>();
		
	}
	
	@SuppressWarnings("all")
	public void method5() {}
	
	public static void main(String[] args) {
	}

}
