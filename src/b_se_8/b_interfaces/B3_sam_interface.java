package b_interfaces;

//function interface are also called single abstract method(sam) interface
//interface with only one abstract method
//abstract method of function interface is implemented using lamba expressions

@FunctionalInterface
interface Student{
	void showName();
}

class ChildClass implements Student{
	public void showName() {
		System.out.println("hello");
	}
}

@FunctionalInterface
interface Teacher{
	int sum(int a, int b);
}

public class B3_sam_interface {

	public static void main(String[] args) {
		Student obj1 = new Student() {
			public void showName() {
				System.out.println("Abhinav");
			}
		};
		obj1.showName();
		
		Student obj2 = () -> System.out.println("Garg");
		obj2.showName();
		
		Teacher obj3 = (a, b) -> a+b;
		System.out.println(obj3.sum(10,20));
		
		Teacher obj4 = (a, b) -> {
			a = a + 100;
			return a+b;
		};
		System.out.println(obj4.sum(10, 20));
		
	}

}
