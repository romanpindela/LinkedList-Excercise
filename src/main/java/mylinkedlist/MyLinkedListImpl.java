package mylinkedlist;


public class MyLinkedListImpl implements MyLinkedList {

    private Node head;

    public MyLinkedListImpl(Node head) {
        this.head = head;
    }


    public MyLinkedListImpl() {

    }

    @Override
    public Node head() {
        return this.head;
    }

    public Node tail() {
        Node last = head;
        if (last == null) { return last; };
        while (last.getNext() != null) {
            last = last.getNext();
        }
        return last;
    }

//    public static Node next(Node element){
//        return element.getNext();
//    }

    @Override
    public void add(Node element) {
        Node lastNode = tail();
        if (head == null) {
            head = element;
        } else {
            lastNode.setNext(element);
        }
//        System.out.println(head + " // " +lastNodeElement + " / " +  element);
    }

    @Override
    public void add(int index, Node element) {
        Node positionNode = searchNode(index);
        Node oldNextNode = positionNode.getNext();
        positionNode.setNext(element);
        element.setNext(oldNextNode);
    }


    private Node searchNode(int index) {
        Node positionNode = head;
        if (index == 0 ) {
            return positionNode;
        } else {
            int currentIndex = 1;
            while (currentIndex <= index && positionNode.getNext() != null) {
                positionNode = positionNode.getNext();
                currentIndex++;
            }
        }
        return positionNode;
    }

    private Node searchNode(Node element) {
        Node positionNode = head;
        while (positionNode != element && positionNode != null) {
            positionNode = positionNode.getNext();
        }
        return positionNode;
    }

    @Override
    public Node get(int index) {
        return searchNode(index);
    }

    @Override
    public void remove(int index) {
        if (index >= 1) {
            Node previousNode = searchNode(index - 1);
            Node nextNode = searchNode(index + 1);
            previousNode.setNext(nextNode);
        } else if (index == 0) {
            head = head.getNext();
        }
    }

    @Override
    public boolean contains(Node element) {
        return searchNode(element) != null;
    }


    private Node previousNode(Node element) {
        Node positionNode = head;
        while (positionNode.getNext() != element && positionNode != null) {
            positionNode = positionNode.getNext();
        }
        return positionNode;
    }


    @Override
    public void remove(Node element) {
        Node previousNode = previousNode(element);
        Node nextNode = searchNode(element.getNext());
        if (previousNode == null) {
            head = element.getNext();
        } else {
            previousNode.setNext(nextNode);
        }
    }

    @Override
    public int indexOf(Node element) {
        Node positionNode = head;
        int indexElement = 0;
        while (positionNode != element && positionNode != null) {
            positionNode = positionNode.getNext();
            indexElement++;
        }
        if (positionNode == null) {
            indexElement = -1;
        }
        return indexElement;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node currentNode = head;
        System.out.println(currentNode);
        while(currentNode != null){
            sb.append(currentNode);
            System.out.println(currentNode);
        }
        return sb.toString();
    }
}
