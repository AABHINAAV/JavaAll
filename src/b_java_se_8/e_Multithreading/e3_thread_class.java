package b_java_se_8.e_Multithreading;

public class e3_thread_class {

  public static class Test extends Thread {

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
    test.start();

    Thread cuThread = new Thread();
    for (int i = 0; i < 1000; i++) {
      System.out.println("main thread : " + cuThread.getName());
    }
  }
}
