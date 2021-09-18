package MyLinkedList;


public class MyLinkedListImpl implements MyLinkedList {

    private NodeElement head;

    public MyLinkedListImpl(NodeElement head) {
        this.head = head;
    }


    public MyLinkedListImpl() {

    }

    @Override
    public NodeElement head() {
        return this.head;
    }

    public NodeElement tail() {
        NodeElement last = head;
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
    public void add(NodeElement element) {
        NodeElement lastNodeElement = tail();
        if (head == null) {
            head = element;
        } else {
            lastNodeElement.setNext(element);
        }
//        System.out.println(head + " // " +lastNodeElement + " / " +  element);
    }

    @Override
    public void add(int index, NodeElement element) {
        NodeElement positionNodeElement = searchNode(index);
        NodeElement oldNextNodeElement = positionNodeElement.getNext();
        positionNodeElement.setNext(element);
        element.setNext(oldNextNodeElement);
    }


    private NodeElement searchNode(int index) {
        NodeElement positionNodeElement = head;
        if (index == 0 ) {
            return positionNodeElement;
        } else {
            int currentIndex = 1;
            while (currentIndex <= index && positionNodeElement.getNext() != null) {
                positionNodeElement = positionNodeElement.getNext();
                currentIndex++;
            }
        }
        return positionNodeElement;
    }

    private NodeElement searchNode(NodeElement element) {
        NodeElement positionNodeElement = head;
        while (positionNodeElement != element && positionNodeElement != null) {
            positionNodeElement = positionNodeElement.getNext();
        }
        return positionNodeElement;
    }

    @Override
    public NodeElement get(int index) {
        return searchNode(index);
    }

    @Override
    public void remove(int index) {
        if (index >= 1) {
            NodeElement previousNodeElement = searchNode(index - 1);
            NodeElement nextNodeElement = searchNode(index + 1);
            previousNodeElement.setNext(nextNodeElement);
        } else if (index == 0) {
            head = head.getNext();
        }
    }

    @Override
    public boolean contains(NodeElement element) {
        return searchNode(element) != null;
    }


    private NodeElement previousNode(NodeElement element) {
        NodeElement positionNodeElement = head;
        while (positionNodeElement.getNext() != element && positionNodeElement != null) {
            positionNodeElement = positionNodeElement.getNext();
        }
        return positionNodeElement;
    }


    @Override
    public void remove(NodeElement element) {
        NodeElement previousNodeElement = previousNode(element);
        NodeElement nextNodeElement = searchNode(element.getNext());
        if (previousNodeElement == null) {
            head = element.getNext();
        } else {
            previousNodeElement.setNext(nextNodeElement);
        }
    }

    @Override
    public int indexOf(NodeElement element) {
        NodeElement positionNodeElement = head;
        int indexElement = 0;
        while (positionNodeElement != element && positionNodeElement != null) {
            positionNodeElement = positionNodeElement.getNext();
            indexElement++;
        }
        if (positionNodeElement == null) {
            indexElement = -1;
        }
        return indexElement;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        NodeElement currentNode = head;
        System.out.println(currentNode);
        while(currentNode != null){
            sb.append(currentNode);
            System.out.println(currentNode);
        }
        return sb.toString();
    }
}
