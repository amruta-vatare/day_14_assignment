package com.bridgeLabs.Collections;

public class LinkedList<E> {
    Node<E> head;
    Node<E> tail;
    Node<E> newNode;

    //Test Case 1
    public void createNode(E value){
        if(head == null &&  tail == null){
            newNode = new Node(value);
            head =newNode;
        }else{
            newNode = new Node<>(value);
            tail.next = newNode;
        }
        tail = newNode;
    }


    public void display(LinkedList list){
        Node<E> currentNode = head;
        while(currentNode != null){
            System.out.println(currentNode.getValue());
            currentNode = currentNode.next;
        }
    }


}
