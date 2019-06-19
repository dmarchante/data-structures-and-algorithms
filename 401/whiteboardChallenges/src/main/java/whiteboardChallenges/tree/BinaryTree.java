package whiteboardChallenges.tree;

import java.util.*;

public class BinaryTree<T> {
    private Node<T> rootNode;

    public ArrayList<T> preOrder() {
        ArrayList<T> arrayList = new ArrayList<>();

        if (this.getRootNode() != null) {
            inPreorderHelper(this.getRootNode(), arrayList);
        }

        return arrayList;
    }

    public ArrayList<T> inOrder() {
        ArrayList<T> arrayList = new ArrayList<>();

        if (this.getRootNode() != null) {
            inOrderHelper(this.getRootNode(), arrayList);
        }

        return arrayList;
    }

    public ArrayList<T> postOrder() {
        ArrayList<T> arrayList = new ArrayList<>();

        if (this.getRootNode() != null) {
            inPostOrderHelper(this.getRootNode(), arrayList);
        }

        return arrayList;
    }

    // https://www.geeksforgeeks.org/level-order-tree-traversal/
    public String breadthFirst(BinaryTree<T> binaryTree) {
        Queue<Node<T>> treeQueue = new LinkedList<>();


        if (binaryTree == null) {
            throw new IllegalArgumentException("There is no root value, operation cannot be completed");
        }

        return breadthFirstHelper(treeQueue, binaryTree);
    }

    private void inPreorderHelper(Node<T> n, ArrayList<T> arrayList) {
        arrayList.add(n.getNodeValue());

        if (n.getLeftNode() != null) {
            inPreorderHelper(n.getLeftNode(), arrayList);
        }

        if (n.getRightNode() != null) {
            inPreorderHelper(n.getRightNode(), arrayList);
        }
    }

    private void inOrderHelper(Node<T> n, ArrayList<T> arrayList) {
        if (n.getLeftNode() != null) {
            inOrderHelper(n.getLeftNode(), arrayList);
        }

        arrayList.add(n.getNodeValue());

        if (n.getRightNode() != null) {
            inOrderHelper(n.getRightNode(), arrayList);
        }
    }

    private void inPostOrderHelper(Node<T> n, ArrayList<T> arrayList) {
        if (n.getLeftNode() != null) {
            inPostOrderHelper(n.getLeftNode(), arrayList);
        }

        if (n.getRightNode() != null) {
            inPostOrderHelper(n.getRightNode(), arrayList);
        }

        arrayList.add(n.getNodeValue());
    }

    // https://www.geeksforgeeks.org/level-order-tree-traversal/
    public String breadthFirstHelper(Queue<Node<T>> queue, BinaryTree<T> binaryTree) {
        StringBuilder s = new StringBuilder();
        queue.add(binaryTree.getRootNode());

        while (!queue.isEmpty()) {
            Node<T> n = queue.peek();

            if (n != null) {
                s.append(n.getNodeValue() + " ");
                queue.remove();

                if (n.getLeftNode() != null)
                    queue.add(n.getLeftNode());

                if (n.getRightNode() != null)
                    queue.add(n.getRightNode());
            }
        }

        return s.toString();
    }

    public BinaryTree() { this.setRootNode(null); }

    public void setRootNode (Node<T> rootNode) {
        this.rootNode = rootNode;
    }

    public Node<T> getRootNode () {
        return rootNode;
    }
}
