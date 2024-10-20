package c_Thread.DaemonThread;

public class D2_daemonThread extends Thread {

  @Override
  public void run() {
    if (Thread.currentThread().isDaemon()) {
      System.out.println("Daemon Thread");
    } else {
      System.out.println("Child Thread");
    }
  }

  public static void main(String[] args) {
    D2_daemonThread thread = new D2_daemonThread();
    thread.setPriority(MAX_PRIORITY);
    thread.setPriority(NORM_PRIORITY);
    thread.setPriority(MIN_PRIORITY);
    thread.setPriority(2);
    thread.setPriority(9);
    // thread.setPriority(-1);     // IllegalArgumentException
    thread.start();
  }
}
