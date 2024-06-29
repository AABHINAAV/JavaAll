package b_se_8.a_Annotations;

class Parent{
	void show() {
		System.out.println("parent class method");
	}
}

class Child extends Parent{
	@Override
	void show() {
		System.out.println("child class method");
	}
}

public class A1_Override {

	public static void main(String[] args) {
		Child obj = new Child();
		obj.show();
	}

}
