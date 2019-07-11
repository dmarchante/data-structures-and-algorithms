package whiteboardChallenges.treeIntersection;

import org.junit.Before;
import org.junit.Test;
import whiteboardChallenges.tree.BinaryTree;
import whiteboardChallenges.tree.Node;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class TreeIntersectionTest {
    public BinaryTree<Integer> binaryTreeOne;
    public BinaryTree<Integer> binaryTreeTwo;
    public BinaryTree<Integer> binaryTreeNull;
    public TreeIntersection<Integer> treeInt;

    @Before
    public void setBinaryTree() {
        Node<Integer> rootOne = new Node<>(1);
        Node<Integer> lOne = new Node<>(2);
        Node<Integer> rOne = new Node<>(3);
        Node<Integer> llOne = new Node<>(4);
        Node<Integer> lrOne = new Node<>(5);
        Node<Integer> rlOne = new Node<>(6);
        Node<Integer> rrOne = new Node<>(7);

        Node<Integer> rootTwo = new Node<>(6);
        Node<Integer> lTwo = new Node<>(7);
        Node<Integer> rTwo = new Node<>(8);
        Node<Integer> llTwo = new Node<>(9);
        Node<Integer> lrTwo = new Node<>(10);
        Node<Integer> rlTwo = new Node<>(11);
        Node<Integer> rrTwo = new Node<>(12);

        rootOne.setLeftNode(lOne);
        lOne.setLeftNode(llOne);
        lOne.setRightNode(lrOne);
        rootOne.setRightNode(rOne);
        rOne.setLeftNode(rlOne);
        rOne.setRightNode(rrOne);

        rootTwo.setLeftNode(lTwo);
        lTwo.setLeftNode(llTwo);
        lTwo.setRightNode(lrTwo);
        rootTwo.setRightNode(rTwo);
        rTwo.setLeftNode(rlTwo);
        rTwo.setRightNode(rrTwo);

        this.binaryTreeOne = new BinaryTree<>();
        this.binaryTreeOne.setRootNode(rootOne);
        this.binaryTreeTwo = new BinaryTree<>();
        this.binaryTreeTwo.setRootNode(rootTwo);
        this.treeInt = new TreeIntersection<>();
        this.binaryTreeNull = new BinaryTree<>();
    }

    @Test
    public void testTreeInsertion() {
        ArrayList<Integer> arrCheck = new ArrayList<>();
        arrCheck.add(6);
        arrCheck.add(7);

        ArrayList arrayActual = treeInt.treeIntersection(this.binaryTreeOne, this.binaryTreeTwo);

        boolean isTrue = arrayActual.equals(arrCheck);

        assertTrue(isTrue);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTreeInsertion_null() {
        this.binaryTreeNull = null;
        ArrayList<Integer> arrCheck = new ArrayList<>();
        arrCheck.add(6);
        arrCheck.add(7);

        ArrayList arrayActual = treeInt.treeIntersection(this.binaryTreeNull, this.binaryTreeTwo);
    }

    @Test
    public void testTreeInsertion_empty() {
        ArrayList<Integer> arrCheck = new ArrayList<>();

        ArrayList arrayActual = treeInt.treeIntersection(this.binaryTreeNull, this.binaryTreeTwo);

        boolean isTrue = arrayActual.equals(arrCheck);

        assertTrue(isTrue);
    }
}