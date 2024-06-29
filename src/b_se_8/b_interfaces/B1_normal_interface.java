package b_interfaces;

interface tempinterface{
	public static final int a = 10;
	
	void method1();
	default void method3() {
		System.out.println("hello");
	}
}

class Students implements tempinterface{
	public void method1() {
		int a = 10;
	}
}

public class B1_normal_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
