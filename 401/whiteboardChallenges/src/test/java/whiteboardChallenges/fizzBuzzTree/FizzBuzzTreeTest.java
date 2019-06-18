package whiteboardChallenges.fizzBuzzTree;

import org.junit.Before;
import org.junit.Test;
import whiteboardChallenges.tree.BinaryTree;
import whiteboardChallenges.tree.Node;

import static org.junit.Assert.assertTrue;

public class FizzBuzzTreeTest {
    public BinaryTree<String> binaryTree;
    public BinaryTree<String> binaryTreeNull;

    @Before
    public void setBinaryTree() {
        Node<String> root = new Node<>("5");
        Node l = new Node<>("3");
        Node r = new Node<>("15");
        Node ll = new Node<>("1");

        root.setLeftNode(l);
        root.setRightNode(r);
        l.setLeftNode(ll);

        this.binaryTree = new BinaryTree<>();
        this.binaryTreeNull = new BinaryTree<>();
        this.binaryTree.setRootNode(root);
    }

    @Test
    public void fizzBuzzTreeTest_Buzz() {
        BinaryTree<String> testResult = FizzBuzzTree.fizzBuzzCheck(binaryTree);
        assertTrue(testResult.getRootNode().getNodeValue().equals("Buzz"));
    }

    @Test
    public void fizzBuzzTreeTest_Fizz() {
        BinaryTree<String> testResult = FizzBuzzTree.fizzBuzzCheck(binaryTree);
        assertTrue(testResult.getRootNode().getLeftNode().getNodeValue().equals("Fizz"));
    }

    @Test
    public void fizzBuzzTreeTest_FizzBuzz() {
        BinaryTree<String> testResult = FizzBuzzTree.fizzBuzzCheck(binaryTree);
        assertTrue(testResult.getRootNode().getRightNode().getNodeValue().equals("FizzBuzz"));
    }

    @Test
    public void fizzBuzzTreeTest_NonFizzBuzz() {
        BinaryTree<String> testResult = FizzBuzzTree.fizzBuzzCheck(binaryTree);
        assertTrue(testResult.getRootNode().getLeftNode().getLeftNode().getNodeValue().equals("1"));
    }

    @Test (expected = IllegalArgumentException.class)
    public void fizzBuzzTreeTest_Null() {
        BinaryTree<String> testResult = FizzBuzzTree.fizzBuzzCheck(binaryTreeNull);
        assertTrue(testResult.getRootNode().getNodeValue().equals(null));
    }
}