package com.TrX;

public class Day_45_DoublyLinkedList {
    DNode Head;
    DNode Tail;
    int size;

    //Creating a Doubly Linked List
    public DNode CreateDoublyLL(int nodeValue){
        DNode node = new DNode();
        node.value = nodeValue;
        node.next=null;
        node.prev=null;
        Head = node;
        Tail = node;
        size =1;
        return Head;
    }
    //Insertion in Doubly Linked List
    public void Insertion(int nodeValue,int location){
        DNode node = new DNode();
        node.value=nodeValue;
        if(Head == null){
            CreateDoublyLL(nodeValue);
            return;
        }
        else if(location == 0){
            node.prev=null;
            node.next=Head;
            Head = node;
        }
        else if (location>=size){
            node.next = null;
            Tail.next=node;
            node.prev=Tail;
            Tail = node;
        }
        else{
            DNode tempNode = Head;
            for(int i=0;i<location-1;i++){
                tempNode=tempNode.next;
            }
            node.prev = tempNode;
            node.next = tempNode.next;
            tempNode.next = node;
            node.next.prev = node;
        }
        size++;
    }
    //Traverse in Doubly Linked List
    public void Traverse(){
        if(Head == null){
            System.out.println("Linked List not found!!");
        }
        DNode tempNode = Head;
        for(int i=0;i<size;i++){
            System.out.print(tempNode.value);
            if(i<size-1){
                System.out.print("<->");
            }
            tempNode = tempNode.next;
        }
        System.out.println("\n");
    }
    //Reverse Traversal in Doubly Linked List
    public void ReverseTraverse(){
        if(Head == null){
            System.out.println("Linked List not found!!");
        }
        DNode tempNode = Tail;
        for(int i=0;i<size;i++){
            System.out.print(tempNode.value);
            if(i<size-1){
                System.out.print("<->");
            }
            tempNode = tempNode.prev;
        }
        System.out.println("\n");
    }

    public static class DoublyLLTest {
        public static void main(String[] args) {
            Day_45_DoublyLinkedList DLL1 = new Day_45_DoublyLinkedList();
            DLL1.CreateDoublyLL(10);
            DLL1.Insertion(20,1);
            DLL1.Insertion(30,2);
            DLL1.Insertion(40,3);
            DLL1.Insertion(50,4);
            DLL1.Traverse();
            DLL1.ReverseTraverse();
        }
    }
}