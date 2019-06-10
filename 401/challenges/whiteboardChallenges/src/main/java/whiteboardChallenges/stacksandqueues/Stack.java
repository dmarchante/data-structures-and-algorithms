package whiteboardChallenges.stacksandqueues;

public class Stack {
    Node topNode;

    public Node pop() {
        Node tempNode;
        if (this.topNode == null) {
            throw new IllegalArgumentException("There is no top value, operation cannot be completed");
        }

        if (this.topNode.nextNode == null) {
            tempNode = this.topNode;
            this.topNode = null;
            return tempNode;
        } else {
            tempNode = this.topNode;
            this.topNode = this.topNode.nextNode;
            return tempNode;
        }
    }

    public void push (int val) {
        this.topNode = new Node(val, this.topNode);
    }

    public int peek () {
        if (this.topNode == null) {
            throw new IllegalArgumentException("There is no top value, operation cannot be completed");
        } else {
            return this.topNode.nodeValue;

        }
    }

    public Stack() {
        topNode = null;
    }
}
