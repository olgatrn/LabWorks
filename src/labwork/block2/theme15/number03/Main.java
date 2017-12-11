package labwork.block2.theme15.number03;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add("num_" + Integer.toString(i));
            linkedList.add("num_" + Integer.toString(i));
        }

        System.out.println("Array List:");
        printElements(arrayList);

        System.out.println("Linked List:");
        printElements(linkedList);

        ListIterator<String> itrOfList = arrayList.listIterator();
        while (itrOfList.hasNext()) {
            linkedList.add(itrOfList.next());
        }

        System.out.println("Linked List with inserted Array List:");
        printElements(linkedList);

        while (itrOfList.hasPrevious()) {
            linkedList.add(itrOfList.previous());
        }

        System.out.println("Linked List with inserted reversed Array List:");
        printElements(linkedList);
    }

    public static <T> void printElements(Collection<T> collection) {
        Iterator<T> itr = collection.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}

