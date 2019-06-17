package whiteboardChallenges.tree;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class BinaryTreeTest<T> {
    public BinaryTree<T> binaryTree;

    @Before
    public void setBinaryTree() {
        Node root = new Node<>(1);
        Node l = new Node<>(2);
        Node r = new Node<>(3);
        Node ll = new Node<>(4);
        Node lr = new Node<>(5);
        Node rl = new Node<>(6);
        Node rr = new Node<>(7);

        root.setLeftNode(l);
        l.setLeftNode(ll);
        l.setRightNode(lr);
        root.setRightNode(r);
        r.setLeftNode(rl);
        r.setRightNode(rr);

        this.binaryTree = new BinaryTree<>();
        this.binaryTree.setRootNode(root);
    }

    @Test
    public void binaryTreeTest_preOrder() {
        assertEquals(new ArrayList<>(Arrays.asList(1, 2, 4, 5, 3, 6, 7)), this.binaryTree.preOrder());
    }

    @Test
    public void binaryTreeTest_inOrder() {
        assertEquals(new ArrayList<>(Arrays.asList(4, 2, 5, 1, 6, 3, 7)), this.binaryTree.inOrder());
    }

    @Test
    public void binaryTreeTest_postOrder() {
        assertEquals(new ArrayList<>(Arrays.asList(4, 5, 2, 6, 7, 3, 1)), this.binaryTree.postOrder());
    }
}