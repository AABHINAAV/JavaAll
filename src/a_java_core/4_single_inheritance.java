class A {
    void show() {
        System.out.println("class A show function");
    }
}

class Result extends A {
    void show() {
        System.out.println("class R show function");
    }
    
    public static void main(String[] args) {
        Result obj = new Result();
        obj.show();
    }
}