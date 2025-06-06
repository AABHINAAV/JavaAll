package b_java_se_8.e_Multithreading.b_synchronization;

public class Counter {

  private int count = 0;

  // * normal method
  public void increment() {
    count++;
  }

  // * synchronization using method synchronization
  // public synchronized void increment() {
  //     count++;
  // }

  // * synchronization using block synchronization
    // public void increment() {
    //   synchronized (this) {
    //     count++;
    //   }
    // }

  public int getCount() {
    return count;
  }
}
