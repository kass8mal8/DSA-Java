package NthNode;

public class LinkedList {
    Node head;
    //Node size;

    public void append(int x){
        Node node = new Node();
        node.data = x;
        node.next = null;
        //node.size = 0;


        if(head == null){
            head = node;
        }
        else{
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = node;
        }

    }

    public int nthNode(int n){
        int count = 0;
        int size = 0;

        Node current = head;
        while(current != null){
            size += 1;
            current = current.next;
        }
        current = head;

        while(count < size - n){
            count += 1;
            current = current.next;
        }

        return current.data;
    }
}
