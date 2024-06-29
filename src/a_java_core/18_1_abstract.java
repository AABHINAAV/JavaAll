abstract class Parent{
    abstract void fun();
    void display(int num){
        System.out.println(num);
    }
}

class Mediator extends Parent {
}

class Child extends Mediator{
    void fun(){
        System.out.println("hello");
        display(10);
    }
}

class Result{
    public static void main(String[] args)
    {
        Mediator mObj = new Mediator();
        Child obj = new Child();
        obj.fun();
        obj.display(20);
    }
}