package LinkedList;

public class MyLinkedList {

    static Node head;

    static class Node{
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    static void reverse(Node node) {
        Node prev = null;
        Node current = node;
        Node next = null;

        while(current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        while(node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }
    public static void main(String[]String) {
        Node node = new Node(1);
        node.next = new Node(2);
        node.next.next = new Node(3);
        node.next.next.next = new Node(4);
        MyLinkedList.reverse(node);
    }
}
