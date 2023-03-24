package Trees;

public class Main {
    public static void main(String [] args){
        Tree tree = new Tree();
        int [] nums = {50, 15, 62, 5, 20, 58, 91, 3, 8, 37, 60, 24};

        for (int num: nums) tree.insert(num);

        System.out.print("Tree B4 deleting 15:");
        tree.preorder_traversal(tree.root_node);

        tree.delete_node(tree.root_node, 15);

        System.out.print("\nTree after deleting 15:");
        tree.preorder_traversal(tree.root_node);

        tree.insert(12);
        System.out.print("\nTree after adding 12:");
        tree.preorder_traversal(tree.root_node);

    }
}
