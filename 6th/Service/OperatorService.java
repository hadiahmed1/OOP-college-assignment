package Service;
import adtInterface.*;
// Implement the OperatorService class that uses the CustomQueue
public class OperatorService implements CustomQueue {
    private String[] queue;
    private int front;
    private int rear;
    private int size;

    public OperatorService(int capacity) {
        this.queue = new String[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    @Override
    public void enqueue(String item) {
        if (size == queue.length) {
            System.out.println("Queue is full. Cannot enqueue " + item);
        } else {
            rear = (rear + 1) % queue.length;
            queue[rear] = item;
            size++;
            System.out.println(item + " added to the queue.");
        }
    }

    @Override
    public String dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return null;
        } else {
            String item = queue[front];
            front = (front + 1) % queue.length;
            size--;
            System.out.println(item + " removed from the queue.");
            return item;
        }
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}