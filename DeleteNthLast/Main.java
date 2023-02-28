package DeleteNthLast;
public class Main {
    public static void main(String [] args){
        LinkedList L = new LinkedList();

        int [] nums = {10, 23, 18, 12, 20};

        for(int num: nums){
            L.append(num);
        }

        System.out.print("List Before:");
        L.traverse();

        L.deleteNthLast(2);

        System.out.print("\n\nList After:");
        L.traverse();
    }
}
