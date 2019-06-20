package whiteboardChallenges.tree;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class BinaryTreeTest<T> {
    public BinaryTree<T> binaryTree;
    public BinaryTree<T> binaryTreeNull;
    public BinaryTree<Integer> binaryTreeMax;

    @Before
    public void setBinaryTree() {
        Node root = new Node<>(1);
        Node l = new Node<>(2);
        Node r = new Node<>(3);
        Node ll = new Node<>(4);
        Node lr = new Node<>(5);
        Node rl = new Node<>(6);
        Node rr = new Node<>(7);

        Node<Integer> rootMax = new Node<>(1);
        Node<Integer> lMax = new Node<>(2);
        Node<Integer> rMax = new Node<>(3);
        Node<Integer> llMax = new Node<>(4);
        Node<Integer> lrMax = new Node<>(5);
        Node<Integer> rlMax = new Node<>(6);
        Node<Integer> rrMax = new Node<>(7);

        root.setLeftNode(l);
        l.setLeftNode(ll);
        l.setRightNode(lr);
        root.setRightNode(r);
        r.setLeftNode(rl);
        r.setRightNode(rr);

        rootMax.setLeftNode(lMax);
        lMax.setLeftNode(llMax);
        lMax.setRightNode(lrMax);
        rootMax.setRightNode(rMax);
        rMax.setLeftNode(rlMax);
        rMax.setRightNode(rrMax);

        this.binaryTree = new BinaryTree<>();
        this.binaryTreeMax = new BinaryTree<>();
        this.binaryTree.setRootNode(root);
        this.binaryTreeMax.setRootNode(rootMax);
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

    @Test
    public void binaryTreeTest_breadth() {
        assertEquals("1 2 3 4 5 6 7 ", this.binaryTree.breadthFirst(binaryTree));
    }

    @Test (expected = IllegalArgumentException.class)
    public void binaryTreeTest_null() {
        assertEquals("1 2 3 4 5 6 7 ", this.binaryTree.breadthFirst(binaryTreeNull));
    }

    @Test
    public void binaryTreeTest_getMax() {
        Integer btMaxValue = binaryTreeMax.findMaxValue(this.binaryTreeMax.getRootNode());
        Integer expected = 7;
        assertEquals(expected, btMaxValue);
    }
}