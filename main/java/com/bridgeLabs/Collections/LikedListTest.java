package com.bridgeLabs.Collections;

public class LikedListTest<E> {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.addNodeAtLast(56);
        list.addNodeAtLast(30);
        list.addNodeAtLast(70);
        list.display(list);


        LinkedList<Integer> list1 = new LinkedList<>();
        list1.addNodeAtFirst(70);
        list1.addNodeAtFirst(30);
        list1.addNodeAtFirst(56);
        list1.display(list1);


        LinkedList<Integer> list2 = new LinkedList<>();
        list2.addNodeAtLast(56);
        list2.addNodeAtLast(70);
        list2.addNodeInBetween(56,70,30);
        list2.display(list2);

        
        list2.deleteFirst(list2);


        list1.deleteLast(list1);


        list.search(30);

        list2.addNodeAfter(70,45);
        list2.display(list2);
    }
}
