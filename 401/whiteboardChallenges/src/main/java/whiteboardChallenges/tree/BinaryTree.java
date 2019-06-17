package whiteboardChallenges.tree;

import java.util.ArrayList;

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

    public BinaryTree() {
        this.setRootNode(null);
    }

    public void setRootNode (Node<T> rootNode) {
        this.rootNode = rootNode;
    }

    public Node<T> getRootNode () {
        return rootNode;
    }
}
