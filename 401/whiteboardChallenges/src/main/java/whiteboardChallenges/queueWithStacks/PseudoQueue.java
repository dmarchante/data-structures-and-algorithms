package whiteboardChallenges.queueWithStacks;

public class PseudoQueue<T> {
    // reference: https://stackoverflow.com/questions/69192/how-to-implement-a-queue-using-two-stacks
    private Stack<T> stackOne;
    private Stack<T> stackTwo;
    private int size;

    public void enqueue(T val) {
        this.stackOne.push(val);

        size++;
    }

    public T dequeue() {
        T tempStack = null;

        if (this.stackOne.isEmpty()) {
            throw new IllegalArgumentException("There is no top value, operation cannot be completed");
        }

        if (this.stackTwo.isEmpty()) {
            while (!stackOne.isEmpty()) {
                stackTwo.push(stackOne.pop());
            }
        }

        if (!this.stackTwo.isEmpty()) {
            tempStack = this.stackTwo.pop();
            size--;
        }

        return tempStack;
    }

//    public int size() {
//        return size;
//    }
//
//    public boolean isEmpty() {
//        return size == 0;
//    }

    public PseudoQueue() {
        stackOne = new Stack<>();
        stackTwo = new Stack<>();
    }
}
