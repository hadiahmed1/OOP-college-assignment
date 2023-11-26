class CounterThread extends Thread {
    private static int counter = 0;

    public CounterThread(String name, int priority) {
        super(name);
        setPriority(priority);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            counter++;
            System.out.println(getName() + ": Counter value = " + counter);
            try {
                Thread.sleep(100); // Simulate some work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Create threads with different priorities
        CounterThread highPriorityThread = new CounterThread("HighPriorityThread", Thread.MAX_PRIORITY);
        CounterThread lowPriorityThread = new CounterThread("LowPriorityThread", Thread.MIN_PRIORITY);
        CounterThread normalPriorityThread = new CounterThread("NormalPriorityThread", Thread.NORM_PRIORITY);

        // Start threads
        highPriorityThread.start();
        lowPriorityThread.start();
        normalPriorityThread.start();

        try {
            // Wait for all threads to finish
            highPriorityThread.join();
            lowPriorityThread.join();
            normalPriorityThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Main thread finishes last
        System.out.println("Main thread finished.");
    }
}
