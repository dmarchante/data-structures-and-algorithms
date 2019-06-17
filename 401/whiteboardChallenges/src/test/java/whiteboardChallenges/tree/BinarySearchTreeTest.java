package whiteboardChallenges.tree;

import org.junit.Before;

import static org.junit.Assert.*;

public class BinarySearchTreeTest<T> {
    public BinarySearchTree<T> binarySearchTree;

    @Before
    public void setBinaryTree() {
        this.binarySearchTree = new BinarySearchTree<>();
    }

}