package whiteboardChallenges.fizzBuzzTree;

import whiteboardChallenges.tree.Node;
import whiteboardChallenges.tree.BinaryTree;

public class FizzBuzzTree {
//    private BinaryTree<String> binaryTree = new BinaryTree<>();
    private Node<String> rootNode;

    public static BinaryTree<String> fizzBuzzCheck(BinaryTree<String> binaryTree) {

        if (binaryTree.getRootNode() == null) {
            throw new IllegalArgumentException("There is no root value, operation cannot be completed");
        }

        if (binaryTree.getRootNode() != null) {
            fizzBuzzCheckHelper(binaryTree.getRootNode());
        }

        return binaryTree;
    }

    private static void fizzBuzzCheckHelper(Node<String> n) {
        String nodeValue = n.getNodeValue();

        if (n.getLeftNode() != null) {
            fizzBuzzCheckHelper(n.getLeftNode());
        }

        if (Integer.parseInt(nodeValue) % 3 == 0 && Integer.parseInt(nodeValue) % 5 == 0) {
            n.setNodeValue("FizzBuzz");
        } else if (Integer.parseInt(nodeValue) % 5 == 0) {
            n.setNodeValue("Buzz");
        } else if (Integer.parseInt(nodeValue) % 3 == 0) {
            n.setNodeValue("Fizz");
        }

        if (n.getRightNode() != null) {
            fizzBuzzCheckHelper(n.getRightNode());
        }
    }

    public FizzBuzzTree() {
        this.setRootNode(null);
    }

    public void setRootNode (Node<String> rootNode) {
        this.rootNode = rootNode;
    }

    public Node<String> getRootNode () {
        return rootNode;
    }
}
