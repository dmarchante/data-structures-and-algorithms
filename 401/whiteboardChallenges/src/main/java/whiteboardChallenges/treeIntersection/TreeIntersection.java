package whiteboardChallenges.treeIntersection;

import whiteboardChallenges.tree.BinaryTree;

import java.util.ArrayList;
import java.util.HashSet;

public class TreeIntersection <Integer> {
    public TreeIntersection() {}

    public ArrayList<Integer> treeIntersection(BinaryTree<Integer> treeOne, BinaryTree<Integer> treeTwo) {
        if(treeOne == null || treeTwo == null) {
            throw new IllegalArgumentException("There is no root value, in one of your trees");
        }

        ArrayList<Integer> treeOneList = treeOne.preOrder();
        ArrayList<Integer> treeTwoList = treeTwo.preOrder();

        HashSet<Integer> hashSetOne = new HashSet<>(treeOneList);
        HashSet<Integer> hashSetTwo = new HashSet<>(treeTwoList);

        hashSetOne.retainAll(hashSetTwo);

        return new ArrayList<>(hashSetOne);
    }
}