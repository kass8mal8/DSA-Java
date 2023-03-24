package Queues;

public class Main {
    public static void main(String [] args){
        Queue queue = new Queue();

        int [] nums = {13, 10, 23, 61};
        for (int num: nums) queue.enqueue(num);

        System.out.println("-- Queue B4 dequeue --");
        queue.traverse();

        System.out.print("\nTop on queue: " + queue.dequeue());

        System.out.println("\n-- Queue after popping --");
        queue.traverse();

    }
}
