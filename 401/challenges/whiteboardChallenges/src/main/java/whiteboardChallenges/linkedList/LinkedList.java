package whiteboardChallenges.linkedList;

import java.util.ArrayList;

public class LinkedList {
    Node headNode;

    public void insert(int val) {
        this.headNode = new Node(val, this.headNode);
    }

    public void append(int val) {
        Node currentNode = this.headNode;

        if (this.headNode == null) {
            currentNode = new Node (val, null );
        }

        while (currentNode.nextNode != null) {
            currentNode = currentNode.nextNode;
        }

        currentNode.nextNode = new Node(val, null);
    }

    public void insertBefore(int valBefore, int newVal) {
        Node currentNode = this.headNode;

        if (currentNode == null) {
            throw new IllegalArgumentException("There is no head value, operation cannot be completed");
        }

        while (currentNode.nextNode != null) {
            if (currentNode.nextNode.nodeValue == valBefore) {
                currentNode.nextNode = new Node(newVal, currentNode.nextNode);
                break;
            }

            currentNode = currentNode.nextNode;
        }
    }

    public void insertAfter(int valAfter, int newVal) {
        Node currentNode = this.headNode;

        if (currentNode == null) {
            throw new IllegalArgumentException("There is no head value, operation cannot be completed");
        }

        while (currentNode.nextNode != null) {
            if (currentNode.nodeValue == valAfter) {
                currentNode.nextNode = new Node(newVal, currentNode.nextNode);
                break;
            }

            currentNode = currentNode.nextNode;
        }
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

    public ArrayList printLinkedList() {
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
