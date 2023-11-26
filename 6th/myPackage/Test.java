package myPackage;
import Service.OperatorService;
// Test class to demonstrate the functionality of OperatorService
public class Test {
    public static void main(String[] args) {
        testOperatorService();
    }

    public static void testOperatorService() {
        OperatorService operatorService = new OperatorService(3);

        // Enqueue customers
        operatorService.enqueue("Customer1");
        operatorService.enqueue("Customer2");
        operatorService.enqueue("Customer3");

        // Dequeue customers (service)
        operatorService.dequeue();
        operatorService.dequeue();
        operatorService.dequeue();

        // Try to dequeue from an empty queue
        operatorService.dequeue();
    }
}
