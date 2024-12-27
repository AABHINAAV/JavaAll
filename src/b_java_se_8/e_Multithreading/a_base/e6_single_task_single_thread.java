package b_java_se_8.e_Multithreading.a_base;

class Task1 implements Runnable {

  @Override
  public void run() {
    System.out.println("Task 1");
  }
}

public class e6_single_task_single_thread {

  public static void main(String[] args) {
    Task1 task1 = new Task1();
    Thread thread1 = new Thread(task1);
    thread1.start();
  }
}
