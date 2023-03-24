package Queues;

public class Queue {
    Node head;

    // method for inserting data to queue
    public void enqueue (int data){
        Node node = new Node();
        node.data = data;
        node.next = head;
        head = node;
    }

    // method for removing top element from queue
    public int dequeue (){
        Node current = head, previous = head;
        while (current.next != null){
            previous = current;
            current = current.next;
        }
        int top = current.data;
        previous.next = null;
        return top;
    }

    // method for traversing the queue
    public void traverse (){
        Node current = head;

        while (current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}
