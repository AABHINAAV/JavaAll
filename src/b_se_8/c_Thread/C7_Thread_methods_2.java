package c_Thread;

public class C7_Thread_methods_2 extends Thread {

  @Override
  public void run() {
    System.out.println("this is user defined thread");
    Thread thread = Thread.currentThread();
    System.out.println("thread name : " + thread.getName());
  }

  public static void main(String[] args) {
    System.out.println("Start");

    Thread thread = Thread.currentThread();
    System.out.println("thread name : " + thread.getName());
    thread.setName("yo yo");
    System.out.println("thread name : " + thread.getName() + "\n");

    try {
      Thread.sleep(2000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }

    C7_Thread_methods_2 c3_thread_methods_1 = new C7_Thread_methods_2();
    c3_thread_methods_1.start();

    System.out.println("End");
  }
}
