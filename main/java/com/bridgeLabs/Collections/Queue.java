package com.bridgeLabs.Collections;

public class Queue<E> {
    Node<E> rear;
    Node<E> front;
    Node<E> newNode;
    int size = 0;

   public void enqueue(E value){
        size++;
        newNode = new Node(value);
        if(rear == null &&  front == null){
            rear = newNode;
        }else{
            front.next = newNode;
        }
        front = newNode;
    }

    public void dequeue(){
        Node<E> tempNode = rear;
        E value;
        while(tempNode != null){
            value = tempNode.getValue();
            System.out.print(value+" ");
            tempNode = tempNode.next;
        }
        System.out.println();
    }
    public int size(){
        return this.size;
    }

    public boolean isEmpty(){
        boolean flag = false;
        if(this.size() == 0){
            flag = true;
        }else{
            flag = false;
        }
        return flag;
    }
}
