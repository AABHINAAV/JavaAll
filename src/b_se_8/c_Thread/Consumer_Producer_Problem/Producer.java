package c_Thread.Consumer_Producer_Problem;

public class Producer extends Thread {

    Company company;

    Producer(Company company) {
        this.company = company;
    }

    @Override
    public void run() {
        int i = 1;

        while(i <= 10)
        {
            try {
                this.company.produce_item(i);
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            i++;
        }
    }
}
