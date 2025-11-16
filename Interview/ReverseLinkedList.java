package Interview;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ReverseLinkedList {

    Node head;

    public void append(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node lastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }

        lastNode.next = newNode;
    }

    public void reverse() {
        Node previous = null;
        Node current = head;
        Node next;

        while(current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        head = previous;
    }

    public void print() {
        Node current = head;

        while(current!=null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        ReverseLinkedList list = new ReverseLinkedList();
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.reverse();
        list.print();

    }
}