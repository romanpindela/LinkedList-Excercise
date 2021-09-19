import mylinkedlist.MyLinkedList;
import mylinkedlist.MyLinkedListImpl;
import mylinkedlist.Node;

public class App {

//    add(E e)
//    Appends the specified element to the end of this list (optional operation).
//            [optional] add(int index, E element)
//    Inserts the specified element at the specified position in this list (optional operation).
//    contains(Object o)
//    Returns true if this list contains the specified element.
//    Kamil Grondys13:16
//    get(int index)
//    Returns the element at the specified position in this list.
//            indexOf(Object o)
//    Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.
//    remove(int index)
//    Removes the element at the specified position in this list
//    remove(Object o)
//    Removes the first occurrence of the specified element from this list, if it is present
//    Kamil Grondys13:17
//
//            1. Robimy interfejs
//            2. Robimy klase Element
//            3. Robimy klase LinkedList, ktora implementuje interfejs
//

    public static void main(String[] args) {

        MyLinkedList myList = new MyLinkedListImpl();

        myList.add(new Node("Asia"));
        myList.add(new Node("Malwina"));
        myList.add(new Node("Kacper"));
        myList.add(new Node("Franciszek"));
        myList.add(new Node("Melania"));
        myList.add(new Node("Adrianna"));
        myList.add(new Node("Jakub"));

        for (int i = 0; i < 7; i++){
            System.out.println(myList.get(i));
        }
//        System.out.println(myList);


    }
}
