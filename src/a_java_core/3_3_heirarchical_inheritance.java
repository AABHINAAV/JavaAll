class A {
    void show() {
        System.out.println("class A overriding function");
    }

}

class B extends A {
    void printfun() {
        A obj = new A();
        obj.show();
    }

}

class C extends A {
    void printfun() {
        A obj = new A();
        obj.show();
    }

}

class Result extends B {
    public static void main(String[] args) {
        B objB = new B();
        objB.printfun();
        
        C objC = new C();
        objC.printfun();
    }
}