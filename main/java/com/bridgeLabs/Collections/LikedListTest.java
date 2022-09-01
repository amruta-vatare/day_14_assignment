package com.bridgeLabs.Collections;

public class LikedListTest<E> {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.addNodeAtLast(56);
        list.addNodeAtLast(30);
        list.addNodeAtLast(70);
        list.display();
        list.search(30);
        System.out.println("__________________________________________");

        LinkedList<String> list1 = new LinkedList<>();
        list1.addNodeAtFirst("Rohan");
        list1.addNodeAtFirst("Raj");
        list1.addNodeAtFirst("Meena");
        list1.addNodeAtFirst("Sumit");
        list1.display();
        list1.deleteLast(list1);
        System.out.println("__________________________________________");


        LinkedList<Integer> list2 = new LinkedList<>();
        list2.addNodeAtLast(56);
        list2.addNodeAtLast(70);
        list2.addNodeInBetween(56,70,30);
        list2.display();
        list2.deleteFirst(list2);
        list2.display();
        list2.addNodeAfter(70,45);
        list2.display();
        System.out.println("__________________________________________");



        Stack<String> stringStack = new Stack<>();
        Stack<Integer> stack = new Stack<>();
        stack.push(22);
        stack.push(90);
        stack.push(45);
        stack.push(50);
        Integer value = stack.pop();
        System.out.println(value);
        System.out.println("Size of stack is : "+stack.size);
        System.out.println("Stack is empty? "+stack.isEmpty());
        System.out.println("Stack is empty? "+stringStack.isEmpty());
        stack.popStack();
        System.out.println("__________________________________________");


        Queue<String> stringQueue = new Queue<>();
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(23);
        queue.enqueue(56);
        queue.enqueue(90);
        queue.enqueue(11);
        System.out.println("Size of queue "+queue.size());
        System.out.println("Queue is empty? "+queue.isEmpty());
        System.out.println("Queue is empty? "+stringQueue.isEmpty());
        queue.dequeue();



    }
}
