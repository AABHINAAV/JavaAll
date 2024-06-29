package c_Thread.Consumer_Producer_Problem;

public class Consumer extends Thread{

    Company company;

    Consumer(Company company) {
        this.company = company;
    }

    @Override
    public void run() {
        int i = 1;

        while(i <= 10) {
            try {
                this.company.consume_item();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            i++;
        }
    }
}
