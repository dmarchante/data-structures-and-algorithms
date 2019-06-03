package whiteboardChallenges.linkedList;

import java.util.ArrayList;

public class LinkedList {
    Node headNode;

    public void insert(int val){
        this.headNode = new Node(val, this.headNode);
    }

    public boolean includes(int value){
        Node currentNode = this.headNode;

        if (this.headNode == null) {
            return false;
        }

        while (currentNode != null) {
            if(currentNode.nodeValue == value) {
                return true;
            } else {
                currentNode = currentNode.nextNode;
            }
        }
        return false;
    }

    public ArrayList print(){
        ArrayList<Integer> nodeOutput = new ArrayList<>();
        Node currentNode = this.headNode;

        if (this.headNode == null) {
            return nodeOutput;
        }

        while (currentNode != null) {
            nodeOutput.add(currentNode.nodeValue);
            currentNode = currentNode.nextNode;
        }

        return nodeOutput;
    }

    public LinkedList() {
        headNode = null;
    }
}
