class ClassA {
    void funA()
    {
        System.out.println("funtion of class A");
    }

    void fun() {
        System.out.println("Class A overridden function");
    }
}

class ClassB extends ClassA {
    void funB()
    {
        System.out.println("funtion of class B");
    }

    void fun() {
        System.out.println("Class B overridden function");
    }
}

class ClassC extends ClassB {
    void funC()
    {
        System.out.println("funtion of class C");
    }

    void fun() {
        System.out.println("Class C overridden function");
    }
}

class Result {
    public static void main(String[] args) {
        ClassA objA = new ClassA();
        objA.fun();
        
        ClassB objB = new ClassB();
        objB.fun();
        
        ClassC objC = new ClassC();
        objC.fun();

        objC.funC();
        objC.funB();
        objC.funA();
    }
}