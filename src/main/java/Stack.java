// Simulating a stack using generics and arrays
public class Stack<S> {
    private S[] stackArray;
    private int top;

    @SuppressWarnings("unchecked exception") // it will be checked at run time
    public Stack(int capacity) {
        stackArray = (S[]) new Object[capacity];
        top = -1;
    }

    public void push(S element) {
        stackArray[++top] = element;
    }

    public S pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stackArray[top--];
    }

    public S get() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stackArray[top];
    }

    public void list() {
        for (int i = top; i >= 0; i--) {
            System.out.println(stackArray[i]);
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }
}