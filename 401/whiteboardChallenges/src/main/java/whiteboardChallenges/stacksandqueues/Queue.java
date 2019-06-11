package whiteboardChallenges.stacksandqueues;

public class Queue {
    Node frontNode;
    Node backNode;

    public void enqueue(int val) {
        Node tempNode = new Node(val, null);

        if (this.frontNode == null) {
            this.frontNode = tempNode;
        } else {
            this.backNode.nextNode = tempNode;
        }

        this.backNode = tempNode;
    }

    public Node dequeue() {
        Node tempNode;

        if (this.frontNode == null) {
            throw new IllegalArgumentException("There is no top value, operation cannot be completed");
        }

        if (this.frontNode.nextNode == null) {
            tempNode = this.frontNode;
            this.frontNode = null;

            return tempNode;
        } else {
            tempNode = this.frontNode;
            this.frontNode = this.frontNode.nextNode;
            tempNode.nextNode = null;

            return tempNode;
        }
    }

    public int peek() {
        if (this.frontNode == null) {
            throw new IllegalArgumentException("There is no top value, operation cannot be completed");
        } else {
            return this.frontNode.nodeValue;
        }
    }

    public Queue() { frontNode = null; }
}
