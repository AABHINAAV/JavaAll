package b_java_se_8.e_Multithreading.b_synchronization;

public class Counter {

  private int count = 0;

  public void increment() {
    count++;
  }

  // * synchronized code
  // public synchronized void increment() {
  //     count++;
  // }

  //   public void increment() {
  //     synchronized (this) {
  //       count++;
  //     }
  //   }

  public int getCount() {
    return count;
  }
}
