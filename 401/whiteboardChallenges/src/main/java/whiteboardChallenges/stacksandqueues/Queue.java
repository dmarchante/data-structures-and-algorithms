package whiteboardChallenges.stacksandqueues;

public class Queue {
    Node frontNode;

    public void enqueue(int val) {
        Node tempNode;

        if (this.frontNode == null) {
            this.frontNode = new Node (val, null );
        }

        while (this.frontNode.nextNode != null) {
            this.frontNode = this.frontNode.nextNode;
        }

        tempNode = this.frontNode;
        this.frontNode = new Node(val, null);
        this.frontNode.nextNode = tempNode;
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
