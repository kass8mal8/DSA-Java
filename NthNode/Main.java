package NthNode;

public class Main {
    public static void main(String [] args){
        LinkedList L = new LinkedList();
        int [] nums = {10, 18, 23, 19, 28};

        for(int x: nums){
            L.append(x);
        }

        int x = 3;
        System.out.print(x + " from last:" + L.nthNode(x));

    }
}
