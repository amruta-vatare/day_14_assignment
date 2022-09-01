package com.bridgeLabs.Collections;

public class LikedListTest<E> {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.addNodeAtLast(56);
        list.addNodeAtLast(30);
        list.addNodeAtLast(70);
        list.display(list);


        LinkedList<String> list1 = new LinkedList<>();
        list1.addNodeAtFirst("Amruta");
        list1.addNodeAtFirst("Suraj");
        list1.addNodeAtFirst("Swapnil");
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

        Stack<Integer> stack = new Stack<>();
       stack.push(22);
       stack.push(90);
       stack.push(45);
       stack.push(50);
        Integer value = stack.pop();
        System.out.println(value);
        System.out.println(stack.size);
        stack.popStack();
        Stack<String> stringStack = new Stack<>();
        System.out.println("Stack is empty "+stack.isEmpty());
        System.out.println("Stack is empty "+stringStack.isEmpty());



    }
}
