interface ExampleInterface {
    public void abstractMethod();

    default void interfaceDefaultMethod1() {
        System.out.println("default method");
    }

    static void interfaceStaticMethod() {
        System.out.println("static method");
    }

    private void interfacePrivateMethod() {
        System.out.println("private method");
    }

    default void interfaceDefaultMethod2() {
        interfacePrivateMethod();
    }
}

class ExampleClass implements ExampleInterface {
    @Override
    public void abstractMethod() {
        System.out.println("implemented abstract method");
    }
}

class Result {
    public static void main(String[] args) {
        ExampleClass exampleClass = new ExampleClass();

        exampleClass.abstractMethod();
        exampleClass.interfaceDefaultMethod1();
        ExampleInterface.interfaceStaticMethod();
        exampleClass.interfaceDefaultMethod2();
    }
}