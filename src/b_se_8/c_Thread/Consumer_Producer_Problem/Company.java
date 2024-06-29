package c_Thread.Consumer_Producer_Problem;

public class Company {
    public int n;
    public String chanceOf = "Producer";

    synchronized void produce_item(int n) throws InterruptedException {
        if(chanceOf.equals("Consumer"))
        {
            wait();
        }

        this.n = n;
        System.out.println("Produced : " + n);

        chanceOf = "Consumser";

        notify();
    }

    synchronized void consume_item() throws InterruptedException {
        if(chanceOf.equals("Producer"))
        {
            wait();
        }

        System.out.println("Consumer : " + this.n);

        chanceOf = "Producer";

        notify();
    }
}
