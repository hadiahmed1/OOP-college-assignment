public class Stack2 {
    private Object[] stackArray;
    private int top;
    private int maxSize;

    public Stack2(int maxSize) {
        this.maxSize = maxSize;
        this.stackArray = new Object[maxSize];
        this.top = -1;
    }

    public void push(Object item) {
        if (top < maxSize - 1) {
            stackArray[++top] = item;
        } else {
            System.out.println("Stack is full. Cannot push " + item);
        }
    }

    public Object pop() {
        if (top>-1) {
            Object item = stackArray[top];
            stackArray[top--] = null;
            return item;
        } else {
            System.out.println("Stack is Empty. Cannot pop ");
            return null;
        }
    }
}