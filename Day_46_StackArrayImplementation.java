package com.TrX;

public class Day_46_StackArrayImplementation {

    int [] arr;
    int topOfStack;

    public Day_46_StackArrayImplementation(int size){
        this.arr = new int [size];
        this.topOfStack = -1 ;
        System.out.println("The stack is created with size of :"+size);
    }
    //isEmpty method to check weather the Stack is empty or not
    public boolean isEmpty(){
        if(topOfStack == -1){
            return true;
        }
        return false;
    }
    //isFull method to check weather the Stack is full or not
    public boolean isFull(){
        if(topOfStack == arr.length-1){
            System.out.println("The Stack is full");
            return true;
        }
        return false;
    }
    //Push method to insert into Stack
    public void push(int value){
        if(isFull()){
            System.out.println("The Stack is Full");
        }
        arr[topOfStack+1] = value;
        topOfStack++;
        System.out.println(value+" is inserted into Stack");
    }
    //Pop method to delete from Stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Error :The Stack is Empty");
            return -1;
        }
        int topStack = arr[topOfStack];
        topOfStack--;
        System.out.println("Removed "+topStack);
        return topStack;
    }
    //Peek method to see last element of Stack
    public int peek(){
        if(isEmpty()){
            System.out.println("The Stack is Empty");
            return -1;
        }
        return arr[topOfStack];
    }
    //Delete method to delete whole Stack
    public void delete(){
        arr = null;
        System.out.println("The Stack is deleted");
    }

    public static class StackArrTest {

        public static void main(String[] args) {
            Day_46_StackArrayImplementation Stack1 = new Day_46_StackArrayImplementation(4);
            System.out.println(Stack1.isEmpty());
            System.out.println(Stack1.isFull());
            Stack1.push(10);
            Stack1.push(20);
            Stack1.push(30);
            Stack1.push(40);
            Stack1.pop();
            System.out.println(Stack1.peek());
            Stack1.delete();
        }

    }
}

