package com.TrX;

public class Day_43_SinglyLinkedList {

    public Node Head;
    public Node Tail;
    public int size;

    public Node CreateSinglyLinkedList(int nodeValue){
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        Head = node;
        Tail = node;
        size = 1;
        return Head;
    }
    //Insertion method in Linked List
    public void InsertInLinkedList(int nodeValue , int location){
        Node node = new Node();
        node.value = nodeValue;
        if(Head == null){
            CreateSinglyLinkedList(nodeValue);
            return;
        } else if (location == 0) {    //insertion in beginning
            node.next = Head;
            Head = node;
        } else if (location >= size) {   //insertion at the end
            node.next = null;
            Tail.next = node;
            Tail = node;
        } else {       //insertion after Specified node
            Node TempNode = Head;
            int i = 0;
            while(i < location-1){
                TempNode = TempNode.next;
                i++;
            }
            Node nextNode = TempNode.next;
            TempNode.next = node;
            node.next = nextNode;
        }
        size++;
    }
    //Traverse Singly Linked List
    public void Traverse(){
        if(Head == null){
            System.out.println("LinkedList does not Exists!");
        }
        Node tempNode = Head;
        for(int i = 0 ;i<size;i++){
            System.out.print(tempNode.value);
            if(i!=size-1){
                System.out.print("->");
            }
            tempNode = tempNode.next;
        }
        System.out.println("\n");
    }
    //Searching in Linked List
    public boolean Search(int nodeValue){
        if(Head!=null){
            Node tempNode = Head;
            for(int i =0 ; i<size ; i++){
                if(tempNode.value == nodeValue){
                    System.out.println("Found the node at location :"+i+"\n");
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("Node not Found!");
        return false;
    }
    //Deleting a node from Linked list
    public void Delete(int location){
        if(Head == null ){
            System.out.println("Single Linked List does not exits!");
            return;
        } else if (location == 0) {    //Deleting First node
            Head = Head.next;
            size--;
            if(size==0){
                Tail = null;
            }
        } else if (location>=size) {    //Deleting the last node
            Node tempNode = Head;
            for(int i=0;i<size-1;i++){
                tempNode = tempNode.next;
            }
            if(tempNode == Head){
                Head = Tail = null;
                size--;
                return;
            }
            tempNode.next=null;
            Tail = tempNode;
            size--;
        }                              //Deleting a specific Node
        Node tempNode = Head;
        for(int i=0;i<location-1;i++){
            tempNode = tempNode.next;
        }
        tempNode.next = tempNode.next.next;
        size--;
    }
    //Delete entire Linked List
    public void DeleteLinkedList(){
        Head = null;
        Tail = null;
        System.out.println("The LinkedList Has Been deleted");
    }
}
