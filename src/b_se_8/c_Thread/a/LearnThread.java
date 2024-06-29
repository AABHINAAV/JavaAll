package c_Thread;

public class LearnThread extends Thread{
    @Override
    public void run() {
    }

    public static void main(String[] args) throws InterruptedException {
        LearnThread thread = new LearnThread();

//        Thread thread = Thread.currentThread();

        System.out.println("old thread name : " + thread.getName());

        Thread.sleep(1000);

        thread.setName("apple");
        System.out.println("new thread name : " + thread.getName());

        System.out.println("old priority : " + thread.getPriority());

        thread.setPriority(3);
        System.out.println("new priority : " + thread.getPriority());

        System.out.println("is thread alive - check 1 : " + thread.isAlive());

        thread.suspend();
        System.out.println("is thread alive - check 2 : " + thread.isAlive());

        thread.start();
        System.out.println(" is thread alive - check 3 : " + thread.isAlive());
        System.out.println("new thread name : " + thread.getName());
    }
}
