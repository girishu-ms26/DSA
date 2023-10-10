package LinkedList;

import java.util.LinkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(0, 1);
        linkedList.add(1, 2);
        linkedList.add(2, 3);
        linkedList.add(3, 4);
        reverseLinkedList(linkedList);
    }
    public static void reverseLinkedList(LinkedList<Integer> linkedList) {
        LinkedList<Integer> reversedLinkedList = new LinkedList<>();
        for(int i=linkedList.size()-1;i>=0;i--) {
            reversedLinkedList.add(linkedList.get(i));
        }
        reversedLinkedList.stream().forEach(i -> System.out.println(i));
    }
}