package mylinkedlist;


public class MyLinkedListImpl implements MyLinkedList {

    private Node head;


    public MyLinkedListImpl() {

    }

    @Override
    public String getHead(){return getHeadNode().getData();}
    private Node getHeadNode() {
        return this.head;
    }

    @Override
    public String getTail(){return getTailNode().getData();}
    private Node getTailNode() {
        Node last = head;
        if (last == null) { return last; };
        while (last.getNext() != null) {
            last = last.getNext();
        }
        return last;
    }


    public void add(String s){ addNode(new Node(s));}
    private void addNode(Node element) {
        Node lastNode = getTailNode();
        if (head == null) {
            head = element;
        } else {
            lastNode.setNext(element);
        }
    }

    @Override
    public void add(int index, String s) { addNode(index, new Node(s));}
    private void addNode(int index, Node element) {
        Node positionNode = searchNode(index);
        Node oldNextNode = positionNode.getNext();
        positionNode.setNext(element);
        element.setNext(oldNextNode);
    }


    @Override
    public String get(int index){ return getNode(index).getData();}
    private Node getNode(int index) {
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
    public void remove(String s){removeNode(new Node(s));}
    private void removeNode(Node element) {
        Node previousNode = previousNode(element);
        Node nextNode = searchNode(element.getNext());
        if (previousNode == null) {
            head = element.getNext();
        } else {
            previousNode.setNext(nextNode);
        }
    }

    @Override
    public boolean contains(String s){return containseNode(new Node(s));}
    private boolean containseNode(Node element) {
        return searchNode(element) != null;
    }



    @Override
    public int indexOf(String s){return indexOfNode(new Node(s));}
    private int indexOfNode(Node element) {
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
        while (positionNode.getData() != element.getData() && positionNode != null) {
            positionNode = positionNode.getNext();
        }
        return positionNode;
    }

    private Node previousNode(Node element) {
        Node positionNode = head;
        while (positionNode.getNext().getData() != element.getData() && positionNode != null) {
            positionNode = positionNode.getNext();
        }
        return positionNode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node currentNode = head;
        while(currentNode != null){
            sb.append(currentNode);
        }
        return sb.toString();
    }
}
