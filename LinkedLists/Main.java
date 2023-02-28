package LinkedLists;

public class Main {
    public static void main(String [] args){
        LinkedList L = new LinkedList();


        int [] arr = {19, 26, 72, 23, 13};
        for (int i : arr) {
            L.insert(i);
        }

        System.out.println("LinkedList");

        L.traverse();
        L.delete(3);
        System.out.println("New array");
        L.traverse();
    }
}
