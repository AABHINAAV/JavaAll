package c_Thread;

public class C5_Thread_Restart_RunnableInterface implements Runnable {

  @Override
  public void run() {
    System.out.println("Thread task");
  }

  public static void main(String[] args) {
    C5_Thread_Restart_RunnableInterface clsObj = new C5_Thread_Restart_RunnableInterface();
    Thread thread1 = new Thread(clsObj);
    thread1.start();
    thread1.start();
  }
}
