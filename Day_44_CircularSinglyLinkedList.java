package com.TrX;

public class Day_44_CircularSinglyLinkedList {

    public Node Head;
    public Node Tail;
    public int size;

    //Creation of Circular Singly LinkedList
    public Node CreateCircularSinglyLL (int nodeValue){
        Node node = new Node();
        node.value = nodeValue;
        node.next = node;
        Head = node;
        Tail = node;
        size = 1;
        return Head;
    }
    //Insertion in Circular Singly Linked List
    public void Insertion(int nodeValue ,int location){
        Node node = new Node();
        node.value = nodeValue;

        if(Head == null){
            CreateCircularSinglyLL(nodeValue);
            return;
        }
        else if (location == 0) {   //Insertion in the beginning
            node.next=Head;
            Head=node;
            Tail.next = Head;
        }
        else if (location >=size) {   //Insertion in the end
            Tail.next = node;
            Tail = node;
            Tail.next = Head;
        } else {                     //Insertion after a specific node
            Node tempNode = Head;
            int i=0;
            while (i < location) {
                tempNode = tempNode.next;
                i++;
            }
            node.next = tempNode.next;
            tempNode.next = node;
        }
        size++;
    }
    //Traverse the circular Singly Linked List
    public void Traverse(){
        if(Head != null){
            Node tempNode = Head;
            for(int i=0 ; i<size ;i++) {
                System.out.print(tempNode.value);
                if (i != size-1) {
                    System.out.print("->");
                }
                tempNode = tempNode.next;
            }
            System.out.println("\n");
        }
        else {
            System.out.println("Circular Singly Linked List Does not exits!");
        }
    }
    //Searching in Singly Linked List
    public boolean Search(int nodeValue){
        Node tempNode = Head;
        int i = 0;
        while(i<size){
            if(tempNode.value == nodeValue){
                System.out.println("Element found at index :"+i);
                return true;
            }
            tempNode = tempNode.next;
            i++;
        }
        System.out.println("Element Not Found!");
        return false;
    }
    //Deletion from circular Singly Linked List
    public void Delete(int location){
        if(Head == null){
            System.out.println("Circular Singly Linked List is Empty!!");
            return;
        } else if(location == 0) {   //Delete from beginning
            Head = Head.next;
            Tail.next = Head;
            size--;
            if(size == 0){
                Head = null;
                Tail = null;
            }
        }
        else if(location >= size){   //Delete from end
            Node tempNode = Head;
            for(int i=0;i<size-1;i++){
                tempNode=tempNode.next;
                if(tempNode == Head){
                    Tail = Head = null;
                    size--;
                    return;
                }
                tempNode.next = Head;
                Tail = tempNode;
                size--;
            }
        }
        else{                      //Delete a specific node
            Node tempNode = new Node();
            for(int i=0;i<location-1;i++){
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
        }
    }
    //Delete Entire Circular Singly Linked List
    public void DeleteCSinglyLinkedList(){
        if(Head == null){
            System.out.println("Linked List not found!");
        }
        Head = Tail = null;
    }

    public static class CircularSinglyLLTest {

        public static void main(String[] args) {

            Day_44_CircularSinglyLinkedList cSLL1 = new Day_44_CircularSinglyLinkedList();
            cSLL1.CreateCircularSinglyLL(10);
            cSLL1.Insertion(20,1);
            cSLL1.Insertion(30,2);
            cSLL1.Insertion(40,3);
            cSLL1.Insertion(50,4);
            cSLL1.Traverse();
            cSLL1.Search(30);
            cSLL1.Delete(0);
            cSLL1.Traverse();
        }

    }
}
