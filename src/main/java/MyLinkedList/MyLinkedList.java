package MyLinkedList;

public interface MyLinkedList {

    void add (int index, NodeElement element);

    void add (NodeElement element);

    NodeElement get(int index);

    int indexOf(NodeElement element);

    void remove(int index);

    void remove(NodeElement element);

    boolean contains(NodeElement element);

    NodeElement head();

    NodeElement tail();

//    Node next(Node element);

}
