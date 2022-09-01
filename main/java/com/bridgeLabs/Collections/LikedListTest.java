package com.bridgeLabs.Collections;

public class LikedListTest {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.createNode(56);
        list.createNode(30);
        list.createNode(70);
        list.createNode(80);
        list.display(list);
    }
}
