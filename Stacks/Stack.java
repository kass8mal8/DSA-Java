package Stacks;

public class Stack {
    Node head;

    // method for inserting data to stack
    public void push (int data){
        Node node = new Node();
        node.data = data;
        node.next = head;
        head = node;
    }

    // method for removing top element from stack
    public int pop (){
        if (head != null){
            Node current = head;
            head = head.next;
            return current.data;
        }
        else {
            System.out.print("List is empty.");
        }
        return 0;
    }

    // method for traversing the stack
    public void traverse (){
        Node current = head;

        while (current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}
