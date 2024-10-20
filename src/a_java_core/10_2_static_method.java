class Result {
    int a = 10;
    static int b = 20;

    void fun1() {
        System.out.println(a);
        System.out.println(Result.b);
    }

    static void fun2() {
        // System.out.println(a);
        // static cannot access non-static class variable
        System.out.println(Result.b);
    }

    /////
    void display1() {
        System.out.println("non static method");
    }

    static void display2() {
        System.out.println("static method");
    }

    void fun3() {
        display1();
        display2();
        Result.display2();
    }

    static void fun4() {
        // display1();
        // static method cannot call non static method
        display2();
        Result.display2();
    }
}