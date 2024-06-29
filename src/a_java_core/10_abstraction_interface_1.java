/*
 * it is used to achieve 100% abstraction
 * it can be used to achieve multiple inheritance in java
 * 
 * 
 * an interface can hold following:
 * public abstract methods
 * public static final variables
 * from version 8 onwards it can hold default concrete method and static concrete method
 * from version 9 onwards it can hold private concrete method 
 * 
 * 
 * an interface cannot be instatiated
 * we use implement keyword to inherit properties of interface
 * a class inherited from interface must override all of its abstract methods
 * 
 * 
 * 
 */

interface i1 {
    int x = 10;
    public static final int y = 20;

    void fun1();

    abstract void fun2();
    public void fun3();
    public abstract void fun4();

    default void fun5() {
    }

    static void fun6() {
    }

    private void fun7() {
    }
}

class Result implements i1 {
    public void fun1() {
    }

    public void fun2() {
    }

    public void fun3() {
    }

    public void fun4() {
    }
}