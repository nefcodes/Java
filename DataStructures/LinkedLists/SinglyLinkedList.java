import java.util.LinkedList;

public class main {

    public static void main(String[] args) {
        System.out.println("\n------------Linked List as a Stack-------------------\n");
        LinkedList<String> XlinkedList = new LinkedList<>();

        // using linked list as a stack
        XlinkedList.push("A"); // add on top of linkedList
        XlinkedList.push("B");
        XlinkedList.push("C");
        XlinkedList.push("D");
        XlinkedList.push("F");

        XlinkedList.pop(); // pop the top item
        System.out.println(XlinkedList);

        XlinkedList.clear(); // removes all elements

        System.out.println("\n------------Linked List as a queue-------------------\n");

       // using linked list as queue

        XlinkedList.offer("A"); // get at the last line
        XlinkedList.offer("B");
        XlinkedList.offer("C");
        XlinkedList.offer("D");
        XlinkedList.offer("F");
//      XlinkedList.poll(); // remove first item of queue

        XlinkedList.add(4, "E");  // index starts from 0
        XlinkedList.remove("E");

        System.out.println("Index of F: " + XlinkedList.indexOf("F"));
        System.out.println("First node: " + XlinkedList.peekFirst()); // see first node..
        System.out.println("Last node: " + XlinkedList.peekLast()); // see last node







    }
}
