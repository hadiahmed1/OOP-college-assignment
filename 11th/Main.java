class SharedResource {
    private int x;
    private boolean canProduce;

    public SharedResource() {
        this.x = 0;
        this.canProduce = true;
    }

    public synchronized void produce() {
        try {
            while (!canProduce) {
                wait(); // Wait until Consumer consumes the value
            }

            x++;
            System.out.println("Produced: " + x);
            canProduce = false;
            notify(); // Notify the Consumer that a new value is ready
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void consume() {
        try {
            while (canProduce) {
                wait(); // Wait until Producer produces a new value
            }

            System.out.println("Consumed: " + x);
            canProduce = true;
            notify(); // Notify the Producer that the value has been consumed
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Producer extends Thread {
    private SharedResource sharedResource;

    public Producer(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        while (true) {
            sharedResource.produce();
        }
    }
}

class Consumer extends Thread {
    private SharedResource sharedResource;

    public Consumer(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        while (true) {
            sharedResource.consume();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        // Create Producer and Consumer threads
        Producer producer = new Producer(sharedResource);
        Consumer consumer = new Consumer(sharedResource);

        // Start threads
        producer.start();
        consumer.start();
    }
}
