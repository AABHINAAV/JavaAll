package b_java_se_8.e_Multithreading.a_base;

public class e4_thread_restart_threadClass {

  public static class Test extends Thread {

    @Override
    public void run() {
      Thread cuThread = new Thread();
      System.out.println("created thread : " + cuThread.getName());
    }
  }

  public static void main(String[] args) {
    Test test = new Test();
    test.start();
    test.start();
  }
}
