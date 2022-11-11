package com.TrX;

class Node{

    public int data;
    public Node next;


}

class SinglylinkedList{
    public Node Head;

    public Node CreateSinglyLinkedList(int data){
        Head = new Node();
        Node node = new Node();
        node.next = null;
        node.data = data;
        Head = node;
        return Head;
    }

}


public class Day_23_LinkedListTest {

    public static void main(String[] args) {

        SinglylinkedList SLL = new SinglylinkedList();
        SLL.CreateSinglyLinkedList(5);
        System.out.println(SLL.Head.data);


    }

}
