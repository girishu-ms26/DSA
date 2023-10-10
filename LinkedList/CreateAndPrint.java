package LinkedList;

import java.util.LinkedList;

public class CreateAndPrint {
    public static void main(String[]args){
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(0,1);
        linkedList.add(1,2);
        linkedList.add(2,3);
        linkedList.add(3,4);
        printLinkedList(linkedList);
    }

    public static void printLinkedList(LinkedList<Integer> linkedList){
        for(int i=0;i<=linkedList.size()-1;i++){
            System.out.println(linkedList.get(i));
        }
    }

}
