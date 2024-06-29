abstract class Parent{
    // abstract int x = 10; // variable cannot be abstract
    int x = 10;
    Parent() {
        System.out.println("abstract class constructor");
    }
}

class Child extends Parent{
    Child(){
        super();
    }
    public static void main(String args[]){
        System.out.println("hello");

        Child parentObj = new Child();

    }
}