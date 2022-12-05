package com.TrX;

public class Day_47_QueueImplementationByArray {

    int [] arr;
    int Rear;
    int Front;

    public Day_47_QueueImplementationByArray(int size){
        this.arr = new int[size];
        this.Rear = -1;
        this.Front = -1;
        System.out.println("The Queue is successfully created with size :"+size);
    }
    //isFull to check weather the queue is full or not
    public boolean isFull(){
        if(Rear == arr.length-1){
            return true;
        }
        return false;
    }
    //isEmpty to check weather the queue is empty or not
    public boolean isEmpty(){
        if(Front == -1 || Front == arr.length){
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
            System.out.println("Successfully inserted "+value+" in the Queue");
        } else{
            Rear++;
            arr[Rear] = value;
            System.out.println("Successfully inserted "+value+" in the Queue");
        }
    }
    //deQueue method to delete an element from the Queue
    public int deQueue(){
        if(isEmpty()){
            System.out.println("The Queue is empty");
            return -1;
        }else {
            int element = arr[Front];
            Front++;
            if (Front > Rear) {
                Front = -1;
                Rear = -1;
                System.out.println("Now the Queue is Empty!");
            }
            return element;
        }
    }
    //peek method to see the 1st element of the Queue
    public int peek(){
        if(!isEmpty()){
            return arr[Front];
        }
        System.out.println("the Queue is empty!");
        return -1;
    }
    //delete method to delete the entire Queue
    public void Delete(){
        arr = null;
        System.out.println("The queue has been deleted!");
    }

    public static class QueueArrTest {

        public static void main(String[] args) {

            Day_47_QueueImplementationByArray queue1 = new Day_47_QueueImplementationByArray(5);
            queue1.enQueue(10);
            queue1.enQueue(20);
            queue1.enQueue(30);
            queue1.enQueue(40);
            queue1.enQueue(50);
            System.out.println(queue1.deQueue());
            System.out.println(queue1.deQueue());
            System.out.println(queue1.peek());
            queue1.Delete();

        }

    }
}
