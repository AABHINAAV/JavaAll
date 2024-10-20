package c_Thread.DaemonThread;

public class D1_daemonThread extends Thread {

  @Override
  public void run() {
    if (Thread.currentThread().isDaemon()) {
      System.out.println("Daemon Thread");
    } else {
      System.out.println("Child Thread");
    }
  }

  public static void main(String[] args) {
    // System.out.println("Main Thread");
    // D1_daemonThread t = new D1_daemonThread();
    // t.start();
    // Main Thread
    // Child Thread
    //
    //
    //
    //
    //
    // System.out.println("Main Thread");
    // D1_daemonThread t = new D1_daemonThread();
    // t.setDaemon(true);
    // t.start();
    // Main Thread
    // Daemon Thread
    //
    //
    //
    //
    //
    // System.out.println("Main Thread");
    // D1_daemonThread t = new D1_daemonThread();
    // t.start();
    // t.setDaemon(true);
    /*
        Main Thread
        Child Thread
        Exception in thread "main" java.lang.IllegalThreadStateException
        at java.base/java.lang.Thread.setDaemon(Thread.java:1403)
        at c_Thread.DaemonThread.D1_daemonThread.main(D1_daemonThread.java:39)
     */
    //
    //
    //
    //
    //
    // Thread currentThread = Thread.currentThread();
    // System.out.println(currentThread.getName());
    // currentThread.setDaemon(true);
    // main
    // Exception in thread "main" java.lang.IllegalThreadStateException
    // at java.base/java.lang.Thread.setDaemon(Thread.java:1403)
    // at c_Thread.DaemonThread.D1_daemonThread.main(D1_daemonThread.java:54)
    //
    //
    //
    //
    //
    D1_daemonThread t = new D1_daemonThread();
    t.setDaemon(true);
    t.start();
    /*
     * daemon thread is built to provide service to main thread
     * but main thread is started but not doing anything
     * so daemon thread will also not do anything thus it will not provide any service to main thread
     * thus there will be no output in this case
     */
  }
}
