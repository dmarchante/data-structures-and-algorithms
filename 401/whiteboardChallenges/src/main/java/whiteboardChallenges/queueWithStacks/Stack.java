package whiteboardChallenges.queueWithStacks;

public class Stack<T> {
    private Node<T> topNode;
    private int size;

    public void push (T val) {
        Node<T> newNode = new Node(val);

        if (this.topNode == null) {
            this.topNode = newNode;
        } else {
            newNode.nextNode = this.topNode;
            this.topNode = newNode;
        }

        size ++;
    }

    public T pop() {
        if (this.topNode == null) {
            throw new IllegalArgumentException("There is no top value, operation cannot be completed");
        }

        T newNode = this.topNode.nodeValue;
        this.topNode = this.topNode.nextNode;

        size --;

        return newNode;
    }

    public T peek () {
        if (this.topNode == null) {
            throw new IllegalArgumentException("There is no top value, operation cannot be completed");
        } else {
            return this.topNode.nodeValue;
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public Stack() {
        topNode = null;
    }

    public class Node<T> {
        T nodeValue;
        Node<T> nextNode;

        public Node(T value) {
            this.nodeValue = value;
        }
    }
}
