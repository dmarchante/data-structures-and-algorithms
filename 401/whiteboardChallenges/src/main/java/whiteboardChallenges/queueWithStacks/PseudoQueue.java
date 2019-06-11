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
        T rearVal;

        if (this.stackOne.isEmpty()) {
            throw new IllegalArgumentException("There is no top value, operation cannot be completed");
        }

        while (!stackOne.isEmpty()) {
            stackTwo.push(stackOne.pop());
        }

        rearVal = this.stackTwo.pop();

        while (!stackTwo.isEmpty()) {
            stackOne.push(stackTwo.pop());
        }

        return rearVal;
    }

    public PseudoQueue() {
        stackOne = new Stack<>();
        stackTwo = new Stack<>();
    }
}
