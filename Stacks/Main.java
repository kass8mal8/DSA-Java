package Stacks;

public class Main {

    public static void main(String [] args){
        Stack stack = new Stack();

        int [] nums = {13, 10, 23, 61};
        for (int num: nums){
            stack.push(num);
        }

        System.out.println("-- Stack B4 popping --");
        stack.traverse();

        System.out.print("\nTop on stack: " + stack.pop());

        System.out.println("\n-- Stack after popping --");
        stack.traverse();

    }
}
