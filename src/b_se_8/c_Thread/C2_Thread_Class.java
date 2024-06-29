package c_Thread;

public class C2_Thread_Class extends Thread{
    @Override
    public void run() {
        // thread ka task provide hota hai yaha
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

    public static void main(String []args)
    {
        C2_Thread_Class c1_thread_class = new C2_Thread_Class();
        c1_thread_class.start();    // ye run method ko start krta hai
    }
}
