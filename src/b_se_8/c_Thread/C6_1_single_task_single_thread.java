package c_Thread;

class Task1 implements Runnable {

  @Override
  public void run() {
    System.out.println("Task 1");
  }
}

public class C6_1_single_task_single_thread {

  public static void main(String[] args) {
    Task1 task1 = new Task1();
    Thread thread1 = new Thread(task1);
    thread1.start();
  }
}
