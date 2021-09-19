package mylinkedlist;


public interface MyLinkedList {

    void add (int index, Node element);

    void add (Node element);

    Node get(int index);

    int indexOf(Node element);

    void remove(int index);

    void remove(Node element);

    boolean contains(Node element);

    Node head();

    Node tail();

//    Node next(Node element);

}
