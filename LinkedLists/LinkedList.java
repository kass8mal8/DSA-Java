package LinkedLists;

public class LinkedList {
    Node head; // first node
    // insert elements into
    public void insert (int x) {
// create an object of class Node['
        Node node = new Node();
        node.data = x;
        node.next = null;

        if (head == null) {
            head = node;
        }
        else {
            Node current = head;
            while (current.next !=null){
                current = current.next;
            }
            current.next = node;
        }
    }

    public void insertStart(int x){
        Node newNode = new Node();
        newNode.data = x;
        newNode.next = head;
        head = newNode;
    }

    // traversal method
    public void traverse (){
        Node current = head;
        while (current !=null){
            System.out.print (current.data + " ");
            current = current.next; // move to the next node
        }
        //System.out.println("Tail node: "+ y.data);
    }

    public void delete(int index){
        Node current = head;
        int count = 0;
        int size = 0;
        //int size = 0

        while (current != null){
            size += 1;
            current = current.next;
        }
        current = head;

        while(count < size - index){
            count += 1;
            current = current.next;
        }
        current.next = current.next.next;
    }

}