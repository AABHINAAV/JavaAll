class A {
    static void show() {
        System.out.println("A class static method");
    }
}

class Result {
    static void display() {
        System.out.println("Result class static method");
    }

    public static void main(String[] args) {
        Result.display();
        A.show();
    }
}