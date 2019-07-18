package whiteboardChallenges.tree;

public class BinarySearchTree<T extends Comparable<T>> {
    Node<T> rootNode;

    public void add(T value) {
        Node<T> newNode = new Node<>(value);

        rootNode = addHelper(value, newNode);
    }

    private Node<T> addHelper(T val, Node<T> n) {
        if (n == null) {
            return new Node<T>(val);
        }

        if (n.getNodeValue().compareTo(val) < 0) {
            n = addHelper(val, n.getRightNode());
        } else if (n.getNodeValue().compareTo(val) > 0) {
            n = addHelper(val, n.getLeftNode());
        } else {
            System.out.println("Node with the same value already exists in this BST");
        }

        return n;
    }

    public boolean contains(T value) {
        return this.containsHelper(value, this.getRoot());
    }

    private boolean containsHelper(T val, Node<T> n) {
        if (n == null) {
            return false;
        }

        if (n.getNodeValue().equals(val)) {
            return true;
        }

        if (n.getNodeValue().compareTo(val) > 0) {
            return containsHelper(val, n.getLeftNode());
        } else {
            return containsHelper(val, n.getRightNode());
        }
    }

    public BinarySearchTree() {
        this.setRoot(null);
    }

    public void setRoot (Node<T> rootNode) {
        this.rootNode = rootNode;
    }

    public Node<T> getRoot () {
        return rootNode;
    }
}
