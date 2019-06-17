package whiteboardChallenges.tree;

public class Node<T> {
    private T nodeValue;
    private Node<T> leftNode;
    private Node<T> rightNode;

    public Node(T value) {
        this.nodeValue = value;
        this.setLeftNode(null);
        this.setRightNode(null);
    }

    public T getNodeValue() { return nodeValue; }

    public Node<T> getLeftNode() { return leftNode; }

    public void setLeftNode(Node<T> leftNode) { this.leftNode = leftNode; }

    public Node<T> getRightNode() { return rightNode; }

    public void setRightNode(Node<T> rightNode) { this.rightNode = rightNode; }
}
