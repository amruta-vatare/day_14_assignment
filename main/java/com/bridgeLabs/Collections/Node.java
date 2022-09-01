package com.bridgeLabs.Collections;

public class Node<E> {
    E Value;
    Node<E> next;

    public Node(E value) {
        this.Value= value;
    }

    public E getValue() {
        return Value;
    }

    public void setValue(E value) {
        Value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "Value=" + Value +
                ", next=" + next +
                '}';
    }
}
