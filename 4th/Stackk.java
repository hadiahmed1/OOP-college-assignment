class Stackk {
    private int[] stack_i;
    private double[] stack_d;
    private String[] stack_s;
    private char[] dataType;
    int top;

    Stackk(int size) {
        this.top = -1;
        this.stack_i = new int[size];
        this.stack_d = new double[size];
        this.stack_s = new String[size];
        this.dataType = new char[size];
    }

    void push(int e) {
        if (this.top == dataType.length - 1) {
            System.out.println("Cannot push stack is full");
            return;
        }
        top++;
        stack_i[top] = e;
        dataType[top] = 'i';
    }

    void push(double e) {
        if (this.top == dataType.length - 1) {
            System.out.println("Cannot push stack is full");
            return;
        }
        top++;
        stack_d[top] = e;
        dataType[top] = 'd';
    }

    void push(String e) {
        if (this.top == dataType.length - 1) {
            System.out.println("Cannot push stack is full");
            return;
        }
        top++;
        stack_s[top] = e;
        dataType[top] = 's';
    }

    void pop() {
        if (top == -1) {
            System.out.println("Cannot pop stack is empty");
            return;
        }
        switch (dataType[top]) {
        case 'i':
            System.out.println(stack_i[top] + " is popped");
            break;
        case 'd':
            System.out.println(stack_d[top] + " is popped");
            break;
        case 's':
            System.out.println(stack_s[top] + " is popped");
            break;
        }
        top--;
    }
}