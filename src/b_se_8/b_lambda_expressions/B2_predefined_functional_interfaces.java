package b_lambda_expressions;

import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

class Person{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

public class B2_predefined_functional_interfaces {

	public static void main(String[] args) {
		// Predicate --> single input single boolean output
//		Predicate<String> obj = (str) -> str.length() > 5;
//		System.out.println(obj.test("abcd"));
//		System.out.println(obj.test("abcdefg"));
		
		// BiPredicate --> two inputs single boolean output
//		BiPredicate<Integer, String> obj = (num, str) -> num > str.length();
//		System.out.println(obj.test(5, "abcdef"));
		
		// Consumer --> single input no output
//		Person p = new Person();
//		Consumer<Person> consumerfunction = (obj) -> obj.setName("Abhinav");
//		consumerfunction.accept(p);
//		System.out.println(p.getName());
		
		// Function --> single input single output
//		Function<Integer, String> functionfunction = (num) -> num*10 + " hello";
//		System.out.println(functionfunction.apply(10));
		
		// Supplier --> no input only output
		Supplier<String> supplierFunction = () -> "I am best";
		System.out.println(supplierFunction.get());
	}

}
