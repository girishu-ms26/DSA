package LinkedList;

public class ReverseLinked {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.head = new MyLinkedList.Node(1);
        myLinkedList.head.next = new MyLinkedList.Node(2);
        myLinkedList.head.next.next = new MyLinkedList.Node(3);

        printMyLinkedList(myLinkedList);
        reverseLinkedList(myLinkedList);
        printMyLinkedList(myLinkedList);

    }

    public static void printMyLinkedList(MyLinkedList linkedList) {
        MyLinkedList.Node head = linkedList.head;
        while(linkedList.head != null) {
            System.out.print(linkedList.head.data);
            linkedList.head = linkedList.head.next;
        }
        linkedList.head = head;
    }
    /*public static void printLinkedList(MyLinkedList linkedList) {
        MyLinkedList.Node h = linkedList.head;
        while (linkedList.head != null) {
            System.out.print(linkedList.head.data + " ");
            linkedList.head = linkedList.head.next;
        }
        System.out.println();
        linkedList.head = h;
    }*/

    public static void reverseLinkedList(MyLinkedList linkedList) {
        MyLinkedList.Node previous = null;
        MyLinkedList.Node current = linkedList.head;
        MyLinkedList.Node next;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        linkedList.head = previous;
    }
}