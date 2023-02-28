package Stacks;
import java.util.Arrays;

public class Main {

    public static void main(String [] args){
        Stack stack = new Stack();

        int [] nums = {13, 21, 10, 11, 23};
        System.out.println("--- Before popping ---");
        System.out.print(Arrays.toString(nums) + " " + "\n");

        for(int x: nums){
            stack.push(x);
        }

        System.out.println("--- After Popping ---");
        while(stack.top >= 0){
            stack.pop();
        }

    }
}
