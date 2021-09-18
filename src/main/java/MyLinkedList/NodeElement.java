package MyLinkedList;

public class NodeElement {
    private String data;
    private NodeElement next;

    public NodeElement(String data) { this.data = data;}

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public NodeElement getNext() {
        return next;
    }

    public void setNext(NodeElement next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "(" + data + ")";
    }
}
