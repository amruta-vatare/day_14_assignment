package com.bridgeLabs.Collections;

public class LinkedList<E> {
    Node<E> head;
    Node<E> tail;
    Node<E> newNode;

    //Test Case 1
    public void addNodeAtLast(E value){
        newNode = new Node(value);
        if(head == null &&  tail == null){
            head =newNode;
        }else{
            tail.next = newNode;
        }
        tail = newNode;
    }

    //Test Case 2
    public void addNodeAtFirst(E value){
        newNode = new Node<>(value);
        if(head == null && tail == null){
            tail = newNode;
        }else{
            newNode.next = head;
        }
        head = newNode;
    }


    public void display(LinkedList list){
        Node<E> currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.getValue()+" ");
            currentNode = currentNode.next;
        }
    }


}
