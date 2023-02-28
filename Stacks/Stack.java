package Stacks;

public class Stack {
    int [] items = new int[5];
    int top = -1;

    public void push(int data){
        top += 1;
        items[top] = data;
    }

    public void pop(){
        if(top < 0){
            System.out.print("Stack is Empty");
        }
        System.out.print(items[top] + " ");
        top -= 1;
    }

}
