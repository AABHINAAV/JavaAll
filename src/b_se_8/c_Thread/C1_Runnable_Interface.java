package c_Thread;

public class C1_Runnable_Interface implements Runnable {
    @Override
    public void run() {
        for(int i=0; i<10; i++)
        {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        C1_Runnable_Interface c1_runnable_interface = new C1_Runnable_Interface();

        Thread threadObj = new Thread(c1_runnable_interface);
        threadObj.start();
    }
}
