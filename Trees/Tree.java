package Trees;

public class Tree {
    Node root_node;

    public void insert (int data){
        Node node = new Node();
        node.data = data;

        if (root_node == null){
            root_node = node;
        }
        else {
            Node current = root_node, parent = root_node;

            while (true){
                parent = current;
                if (data < current.data){
                    current = current.left_child;

                    if (current == null){
                        parent.left_child = node;
                        break;
                    }
                }
                else{
                    current = current.right_child;

                    if (current == null){
                        parent.right_child = node;
                        break;
                    }
                }
            }

        }
    }

    public int min_node(Node root){
        if (root.left_child == null){
            return root.data;
        }
        return min_node(root.left_child);
    }

    public Node delete_node (Node root, int data){
        if (root == null) return null;
        if (data < root.data){
            root.left_child = delete_node(root.left_child, data);
        }
        else if (data > root.data) {
            root.right_child = delete_node(root.right_child, data);
        }
        else {
            if (root.right_child == null){
                return root.left_child;
            }
            else if (root.left_child == null){
                return root.right_child;
            }

            root.data = min_node(root.right_child);
            root.right_child = delete_node(root.right_child, root.data);
        }

        return root;
    }

    public void preorder_traversal(Node root){
        if (root != null){
            System.out.print(root.data + " ");
            preorder_traversal(root.left_child);
            preorder_traversal(root.right_child);
        }
    }
}
