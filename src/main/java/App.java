import MyLinkedList.MyLinkedList;
import MyLinkedList.MyLinkedListImpl;
import MyLinkedList.NodeElement;

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

        myList.add(new NodeElement("Asia"));
        myList.add(new NodeElement("Malwina"));
        myList.add(new NodeElement("Kacper"));
        myList.add(new NodeElement("Franciszek"));
        myList.add(new NodeElement("Melania"));
        myList.add(new NodeElement("Adrianna"));
        myList.add(new NodeElement("Jakub"));

        for (int i = 0; i < 7; i++){
            System.out.println(myList.get(i));
        }
//        System.out.println(myList);


    }
}
