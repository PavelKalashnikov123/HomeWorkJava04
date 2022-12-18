public class MyStack {
    private int size;
    private int[] StackHolder;
    private int top;

    public MyStack(int size) {
        this.size = size;
        StackHolder = new int[size];
        top = -1;
    }

    public void push(int element) {
        if (!isFull()) {
            top++;
            StackHolder[top] = element;
        }
    }

    public int peek() {
        return StackHolder[top];
    }

    public int pop() {
        return StackHolder[top--];
    }

    public Boolean isEmpty() {
        return (top == -1);
    }

    public Boolean isFull() {
        return (top == size - 1);
    }

    public class UseStack {
        public static void main(String[] args) {
            MyStack S = new MyStack(20); //[] top=-1
            S.push(25); // [20] top =0
            S.push(35); // [20,35] top=1
            S.push(22); // [20,35,22] top=2

            System.out.println("Current Peek Value is : " + S.peek());

            S.push(99); // [20,35,22,99] top=3
            S.push(82); // [20,35,22,99,82] top=4

            S.pop(); // [20,35,22,99] top=3
            S.pop(); // [20,35,22,99] top=2

            while (!S.isEmpty()) {
                System.out.println("Poped Element " + S.pop());
            }
        }

    }
    
}
