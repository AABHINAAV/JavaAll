class A {
    void showA() {
        System.out.println("class A show function");
    }

    void show() {
        System.out.println("class A overriding function");
    }

}

class B extends A {
    void showB() {
        System.out.println("class B show function");
    }

    void show() {
        System.out.println("class B overriding function");
    }

}

class Result extends B {
    void showR() {
        System.out.println("class R show function");
    }

    void show() {
        System.out.println("class R overriding function");
    }

    public static void main(String[] args) {
        Result obj = new Result();
        obj.showA();
        obj.showB();
        obj.showR();

        Result objR = new Result();
        objR.show();
        B objB = new B();
        objB.show();
        A objA = new A();
        objA.show();
    }
}

/*
 * jis class me object bana h usme function ko search kreaga agra mil gya to
 * theek nahi to parent class me check krega
 */