package whiteboardChallenges.queueWithStacks;

public class PseudoQueue<T> {
    // reference: https://stackoverflow.com/questions/69192/how-to-implement-a-queue-using-two-stacks
    private Stack<T> stackOne;
    private Stack<T> stackTwo;

    public void enqueue(T value) {
        this.stackOne.push(value);
    }

    public T dequeue() {
        T rearVal;

        if (this.stackOne.isEmpty()) {
            throw new IllegalArgumentException("There is no top value, operation cannot be completed");
        }

        while (!this.stackOne.isEmpty()) {
            this.stackTwo.push(stackOne.pop());
        }

        rearVal = this.stackTwo.pop();

//        while (!stackTwo.isEmpty()) {
//            stackOne.push(stackTwo.pop());
//        }

        return rearVal;
    }

    public PseudoQueue() {
        stackOne = new Stack<>();
        stackTwo = new Stack<>();
    }
}
