package b_java_se_8.e_Multithreading.b_synchronization;

public class Test {

  public static void main(String[] args) {
    Counter counter = new Counter();

    MyThread t1 = new MyThread(counter);
    MyThread t2 = new MyThread(counter);
    t1.start();
    t2.start();

    try {
        t1.join();
        t2.join();
    } catch (Exception e) {
        System.out.println(e);
    }

    System.out.println("\n\ncount : " + counter.getCount());
  }
}