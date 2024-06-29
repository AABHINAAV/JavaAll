package b_se_8.a_Annotations;

class ParentDeprecated{
	@Deprecated
	void displayOld() {
		System.out.println("Old method");
	}
}

public class A2_Deprecated extends ParentDeprecated {
	
	void displayNew() {
		System.out.println("new method");
	}
	
	public static void main(String[] args) {
		A2_Deprecated obj = new A2_Deprecated();
		
		obj.displayOld();
		obj.displayNew();
	}
}
