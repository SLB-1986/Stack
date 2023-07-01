// Simulating a stack using generics and arrays
public class Stack<S> {
    private static final int DEFAULT_CAPACITY = 10;
    private S[] stackArray;
    private int top;

    @SuppressWarnings("unchecked exception")
//    it will be checked at run time

    public Stack(/*int capacity*/) {
//        stackArray = (S[]) new Object[capacity];
        stackArray = (S[]) new Object[DEFAULT_CAPACITY];
        top = -1;
    }

    public void push(S element) {
//        stackArray[++top] = element;
        if (top == stackArray.length - 1) {
            resizeArray();
        }
        stackArray[++top] = element;
    }

    private void resizeArray() {
        int newCapacity = stackArray.length * 2;
        S[] newArray = (S[]) new Object[newCapacity];
        System.arraycopy(stackArray, 0, newArray, 0, stackArray.length);
        stackArray = newArray;
    }

    public S pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
//        return stackArray[top--];
        S element = stackArray[top--];
        return element;
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