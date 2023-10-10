package Hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashsetProblems {
    public static void main(String[]args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("1");
        hashSet.add("2");
        hashSet.add("3");
        hashSet.add("4");
        addDataToHashSet(hashSet);
        iteratorForHashSet(hashSet);
        emptyAnHashSet(hashSet);
        convertHashSetToArray(hashSet);
    }

    private static void addDataToHashSet(HashSet<String> hashSet) {
        System.out.println(hashSet);
    }

    private static void iteratorForHashSet(HashSet<String> hashSet){
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    private static void emptyAnHashSet(HashSet<String> hashSet) {
        System.out.println(hashSet);
        hashSet.clear();
        System.out.println(hashSet);
    }

    private static void convertHashSetToArray(HashSet<String> hashSet) {
        ArrayList<String> list = new ArrayList<>(hashSet);
        System.out.println(list);
    }

}
