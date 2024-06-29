package c_Thread;

public class C4_Thread_Restart_ThreadClass extends Thread {
    @Override
    public void run() {
        System.out.println("Thread task");
    }

    public static void main(String[] args) {
        C4_Thread_Restart_ThreadClass obj = new C4_Thread_Restart_ThreadClass();
        obj.start();
        obj.start();
    }
}