class FactorialThread extends Thread {
    private int number;
    private long factorial;

    public FactorialThread(int number) {
        this.number = number;
        this.factorial = 1;
    }

    public long getFactorial() {
        return factorial;
    }

    @Override
    public void run() {
        calculateFactorial();
    }

    private void calculateFactorial() {
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + number + ": " + factorial);
    }
}

class FactorsThread extends Thread {
    private int number;

    public FactorsThread(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        calculateFactors();
    }

    private void calculateFactors() {
        System.out.print("Factors of " + number + ": ");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        int inputNumber = 6; // You can change this to any positive integer

        // Create threads
        FactorialThread factorialThread = new FactorialThread(inputNumber);
        FactorsThread factorsThread = new FactorsThread(inputNumber);

        // Start threads
        factorialThread.start();
        factorsThread.start();

        try {
            // Wait for both threads to finish
            factorialThread.join();
            factorsThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Main thread finishes last
        System.out.println("Main thread finished.");
    }
}
