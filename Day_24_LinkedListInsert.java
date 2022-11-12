package com.TrX;

public class Day_24_LinkedListInsert {

    SinglylinkedList SLL =new SinglylinkedList();
    public void BeginInsertInLinkedList(int NodeValue){
        Node node = new Node();
        node.data=NodeValue;
        if(SLL.Head == null){
            SLL.CreateSinglyLinkedList(NodeValue);
            return;
        } else {
            node.next = SLL.Head;
            SLL.Head = node;
        }
    }

    public static void main(String[] args) {

        SinglylinkedList SLL =new SinglylinkedList();
        SLL.CreateSinglyLinkedList(5);
        Day_24_LinkedListInsert S = new Day_24_LinkedListInsert();
        S.BeginInsertInLinkedList(10);

    }

}
