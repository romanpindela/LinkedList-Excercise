package mylinkedlist;


public interface MyLinkedList {

    void add (int index, String element);

    void add (String element);

    String get(int index);

    int indexOf(String element);

    void remove(int index);

    void remove(String element);

    boolean contains(String element);

    String getHead();
    String getTail();

}
