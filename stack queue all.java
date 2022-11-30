..................................................
//Stack Using Queue
..................................................

import java.util.*;

public class Main {

    public static void main(String[] args) {
        stack s = new stack();
        s.push(3);
        s.push(2);
        s.push(4);
        s.push(1);
        System.out.println(s.pop());
        System.out.println(s.pop());
    }

}
class stack {
    Queue < Integer > q = new LinkedList < > ();
    void push(int x) {
        q.add(x);
        for (int i = 0; i < q.size() - 1; i++) {
            q.add(q.remove());
        }
    }
    int pop() {
        return q.remove();
    }
    int top() {
        return q.peek();
    }
    int size() {
        return q.size();
    }
}

//////////////////////////////////////////////////////////////////
//Implement Queue using stack
..................................................
public class Main {
    public static void main(String[] args){
        Queue ritesh = new Queue();
        ritesh.push(4);
        ritesh.push(1);
        ritesh.push(2);
        
        int result = ritesh.pop();
        System.out.println(result);

        int result1 = ritesh.pop();
        System.out.println(result1);
        
    }
    
}

..................................
Queue.java
..................................
 import java.util.Stack;

class Queue{
    Stack<Integer> pushS = new Stack<>();
    Stack<Integer> popS = new Stack<>();

    public Queue(){

    }

    public void push(int x){
        pushS.push(x);
        System.out.println("Inserted " + x);

    }
    private void convert(){
        int size = pushS.size();
        for(int i=0;i< size;i++){
            Integer top = pushS.pop();
            popS.push(top);
        }

    }
    public int pop(){
        if(popS.isEmpty()){
            convert();
        }
        return popS.pop();
    }
    public int peek(){
        if(popS.isEmpty()){
            convert();
        }
        return popS.peek();
    }
    public boolean empty(){
        return pushS.isEmpty() && popS.isEmpty();
    }
}
........................................................
//Normal Stack 
........................................................
.................
Main.java
.................
public class Main {
    public static void main(String[] args){
        Stack ritesh = new Stack(4);
        ritesh.push(1);
        ritesh.push(2);
         
        int result = ritesh.pop();
        System.out.println(result);

        int result1 = ritesh.pop();
        System.out.println(result1);
    }
}

..................................
Stack.java
..................................
class Stack{
    private int array[];
    private int top;
    private int capacity;

    Stack(int capacity){
        this.array = new int[capacity];
        this.capacity = capacity;
        this.top = -1;
    }
    public boolean isEmpty(){
        return top == -1;
    }
    public boolean isFull(){
        return top == capacity -1;
    }

    public void push(int item){
        if(isFull()){
            throw new RuntimeException("Stack is full");
        }
        array[++top] = item;
        System.out.println("Pushed" + item);
    }

    public int peek(){
        return array[top];
         

    }

    public int pop(){

        if(isEmpty()){
            throw new RuntimeException("Stack is empty");
        }
        return array[top--];
         


    }
}
..........................................................................
