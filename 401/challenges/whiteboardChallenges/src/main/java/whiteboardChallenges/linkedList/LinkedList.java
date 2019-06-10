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
            this.headNode = new Node (val, null );
            return;
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
            if (currentNode.nodeValue == valBefore) {
                this.insert(newVal);
                break;
            } else if (currentNode.nextNode.nodeValue == valBefore) {
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
                return;
            }

            currentNode = currentNode.nextNode;
        }

        if(currentNode.nodeValue == valAfter) {
            this.append(newVal);
        }
    }

    public int valueAtNthFromEnd(int index) {
        Node currentNode = this.headNode;
        int length = 0;

        if (currentNode == null) {
            throw new IllegalArgumentException("There is no head value, operation cannot be completed");
        }

        while (currentNode != null) {
            currentNode = currentNode.nextNode;
            length++;
        }

        if (length < index + 1 || index < 0) {
            throw new IllegalArgumentException("There is value at this index, operation cannot be completed");
        }

        currentNode = this.headNode;

        for (int i = 0; i < length - index - 1; i++) {
            currentNode = currentNode.nextNode;
        }

        return currentNode.nodeValue;
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

    public static LinkedList mergeLists(LinkedList one, LinkedList two) {
        Node currentNodeOne = one.headNode;
        Node currentNodeTwo = two.headNode;
        LinkedList mergedList = new LinkedList();
        int oneLength = 0;
        int twoLength = 0;

        if (one == null && two == null) {
            throw new IllegalArgumentException("There is no head value, operation cannot be completed");
        }

        if (one == null) {
            return two;
        }

        if (two == null) {
            return one;
        }

        while (currentNodeOne != null) {
            currentNodeOne = currentNodeOne.nextNode;
            oneLength++;
        }

        while (currentNodeTwo != null) {
            currentNodeTwo = currentNodeTwo.nextNode;
            twoLength++;
        }

        currentNodeOne = one.headNode;
        currentNodeTwo = two.headNode;

        if (oneLength >= twoLength) {
            while (currentNodeOne != null) {
                mergedList.insert(currentNodeTwo.nodeValue);
                mergedList.insert(currentNodeOne.nodeValue);

                currentNodeOne = currentNodeOne.nextNode;
                currentNodeTwo = currentNodeTwo.nextNode;
            }
        } else {
            while (currentNodeTwo != null) {
                mergedList.insert(currentNodeTwo.nodeValue);
                mergedList.insert(currentNodeOne.nodeValue);

                currentNodeOne = currentNodeOne.nextNode;
                currentNodeTwo = currentNodeTwo.nextNode;
            }
        }

        return mergedList;
    }

    public static LinkedList mergeListAlt(LinkedList one, LinkedList two) {
        Node currentNodeOne = one.headNode;
        Node currentNodeTwo = two.headNode;
        LinkedList mergedList = new LinkedList();

        if (one == null && two == null) {
            throw new IllegalArgumentException("There is no head value, operation cannot be completed");
        }

        if (one == null) {
            return two;
        }

        if (two == null) {
            return one;
        }

        while(currentNodeOne != null && currentNodeTwo != null) {
            mergedList.append(currentNodeOne.nodeValue);
            mergedList.append(currentNodeTwo.nodeValue);

            currentNodeOne = currentNodeOne.nextNode;
            currentNodeTwo = currentNodeTwo.nextNode;
        }

        if (currentNodeOne != null) {
            while (currentNodeOne != null) {
                mergedList.append(currentNodeOne.nodeValue);

                currentNodeOne = currentNodeOne.nextNode;
            }
        }

        if (currentNodeTwo != null) {
            while (currentNodeTwo != null) {
                mergedList.append(currentNodeTwo.nodeValue);

                currentNodeTwo = currentNodeTwo.nextNode;
            }
        }

        return mergedList;
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
