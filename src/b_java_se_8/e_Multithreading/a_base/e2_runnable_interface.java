package b_java_se_8.e_Multithreading.a_base;

public class e2_runnable_interface {

  public static class Test implements Runnable {

    @Override
    public void run() {
      Thread cuThread = new Thread();
      for (int i = 0; i < 1000; i++) {
        System.out.println("created thread : " + cuThread.getName());
      }
    }
  }

  public static void main(String[] args) {
    Test test = new Test();
    Thread thread1 = new Thread(test);
    thread1.start();

    Thread cuThread = new Thread();
    for (int i = 0; i < 1000; i++) {
      System.out.println("main thread : " + cuThread.getName());
    }
  }
}
