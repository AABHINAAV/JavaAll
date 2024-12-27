package b_java_se_8.e_Multithreading.b_synchronization;

public class MyThread extends Thread {

  private Counter counter;

  public MyThread(Counter counter) {
    this.counter = counter;
  }

  @Override
  public void run() {
    for (int i = 0; i < 1000; i++) {
      counter.increment();
    }
  }
}
