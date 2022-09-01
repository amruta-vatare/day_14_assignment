package com.bridgeLabs.Collections;

import com.sun.java.accessibility.util.TopLevelWindowListener;

public class Stack<E> {
    Node<E> top;
    Node<E> bottom;
    Node<E> newNode;
    int size = 0;

    public void push(E value){
        size++;
        newNode = new Node<>(value);
        if(bottom == null && top == null){
            top = newNode;
        }else{
            newNode.next = bottom;
        }
        bottom = newNode;
    }
    
    public E pop(){
        Node<E> currentNode = bottom;
        E value = null;
        if(currentNode != null){
            value = currentNode.getValue();
            return value;
        }
        return value;
    }

    public void popStack(){
        Node<E> tempNode = bottom;
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
