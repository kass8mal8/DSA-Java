package DeleteNthLast;
public class LinkedList {
    Node head;

    public void append(int data){
        Node node = new Node();
        node.data = data;

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

    public void deleteNthLast(int n){
        Node current = head;
        int count = 0;
        int size = 0;

        while(current != null){
            size += 1;
            current = current.next;
        }

        current = head;

        while(count < (size - 1) - n){
            count += 1;
            current = current.next;
        }

        current.next = current.next.next;
    }

    public void traverse(){
        Node current = head;

        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }

    }
}
