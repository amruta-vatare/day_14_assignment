package com.bridgeLabs.Collections;

public class LinkedList<E> {
    Node<E> head;
    Node<E> tail;
    Node<E> newNode;

    //Use Case 1/Use Case 3
    public void addNodeAtLast(E value){
        newNode = new Node(value);
        if(head == null &&  tail == null){
            head =newNode;
        }else{
            tail.next = newNode;
        }
        tail = newNode;
    }

    //Use Case 2
    public void addNodeAtFirst(E value){
        newNode = new Node<>(value);
        if(head == null && tail == null){
            tail = newNode;
        }else{
            newNode.next = head;
        }
        head = newNode;
    }

    //Use Case 4
    public void addNodeInBetween(E after, E before,E value){
        Node<E> node =  searchNode(after);
        if(node != null && node.next.getValue() == before){
            newNode = new Node<>(value);
            newNode.next = node.next;
            node.next = newNode;
        }else{
            System.out.println("Node is not present!");
        }
    }

    //Use Case 5
    public void deleteFirst(LinkedList<E> list){
        Node<E> currentNode = list.head;
        list.head = currentNode.next;
        currentNode.next = null;
        display(list);
    }

    //Use Case 6
    public void deleteLast(LinkedList<E> list){
        Node<E> currentNode = list.head;
        while(currentNode != null){
            if(currentNode.next == tail){
                tail = currentNode;
                currentNode.next = null;
            }
            currentNode = currentNode.next;
        }
        display(list);
    }

    //Use Case 7
    public void search(E value){
        Node node = searchNode(value);
        if(node != null){
            System.out.println("Node is present with value "+value);
        }else{
            System.out.println("Node is not present with value "+value);
        }
    }

    //Use Case 8
    public void addNodeAfter(E value1,E value){
        Node<E> node =  searchNode(value1);
        if(node != null){
            newNode = new Node<>(value);
            newNode.next = node.next;
            node.next = newNode;
        }else{
            System.out.println("Node is not present!");
        }
    }

    private Node<E> searchNode(E value1) {
        Node<E> currentNode = head;
        while(currentNode != null){
            if(currentNode.getValue() == value1)
                return currentNode;
            currentNode = currentNode.next;
        }
        return null;
    }

    public void display(LinkedList<E> list){
        Node<E> currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.getValue()+" ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }


}
