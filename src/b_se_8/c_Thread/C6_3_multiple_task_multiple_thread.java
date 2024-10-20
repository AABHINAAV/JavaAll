package c_Thread;

class Task1 implements Runnable {

  @Override
  public void run() {
    System.out.println("Task 1");
  }
}

class Task2 implements Runnable {

  @Override
  public void run() {
    System.out.println("Task 2");
  }
}

class Task3 implements Runnable {

  @Override
  public void run() {
    System.out.println("Task 3");
  }
}

public class C6_3_multiple_task_multiple_thread {

  public static void main(String[] args) {
    Task1 task1 = new Task1();
    Thread thread1 = new Thread(task1);
    thread1.start();

    Task2 task2 = new Task2();
    Thread thread2 = new Thread(task2);
    thread2.start();

    Task3 task3 = new Task3();
    Thread thread3 = new Thread(task3);
    thread3.start();
  }
}
