package com.TrX;


public class Day_48_CircularQueue {

    int [] arr;
    int Front;
    int Rear;
    int size;

    public Day_48_CircularQueue(int size){
        this.arr = new int[size];
        this.size=size;
        this.Front = -1;
        this.Rear = -1;
        System.out.println("Circular Queue is Created with size "+size);
    }
    //isEmpty method to check weather the Queue is empty
    public boolean isEmpty(){
        if(Rear == -1){
            return true;
        }
        return false;
    }
    //isFull method to check weather the Queue is full
    public boolean isFull(){
        if(Rear+1 == Front){
            return true;
        } else if (Front == 0 && Rear+1 == size) {
            return true;
        }
        return false;
    }
    //enQueue method to insert element to the Queue
    public void enQueue(int value){
        if(isFull()){
            System.out.println("The Queue is full!");
        } else if (isEmpty()){
            Front = 0;
            Rear++;
            arr[Rear] = value;
            System.out.println("Successfully inserted "+value+" int the Queue");
        }
        else{
            if(Rear == size){
                Rear = 0;
            } else{
                Rear++;
            }
            arr[Rear] = value;
            System.out.println("Successfully inserted "+value+" int the Queue");
        }
    }
    //deQueue method to delete an element from Queue
    public int deQueue(){
        if(isEmpty()){
            System.out.println("The Queue is empty!");
            return -1;
        }
        else {
            int element = arr[Front];
            arr[Front] = Integer.MIN_VALUE;
            if(Front == Rear){
                Front = -1;
                Rear = -1;
            } else if (Front+1 == size){
                Front=0;
            }else{
                Front++;
            }
            return element;
        }
    }
    //peek method to see the 1st element in the Queue
    public int peek(){
        if(isEmpty()){
            System.out.println("The Queue is Empty");
            return -1;
        }
        return arr[Front];
    }
    //delete method
    public void Delete(){
        arr = null;
        System.out.println("The Queue is successfully deleted!");
    }

    public static class CircularQueueTest {

        public static void main(String[] args) {

            Day_48_CircularQueue cQueue1 = new Day_48_CircularQueue(5);
            cQueue1.enQueue(10);
            cQueue1.enQueue(20);
            cQueue1.enQueue(30);
            cQueue1.enQueue(40);
            cQueue1.enQueue(50);


        }

    }
}
