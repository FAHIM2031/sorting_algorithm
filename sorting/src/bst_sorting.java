 class Node {
    int info;
    Node l_Node, r_Node;

    public Node(int item)
    {
        info=item;
        l_Node = r_Node = null;
    }   
}


 class BST {

    Node root;

    void insert_element(int key) {
        root = inset_n_el(root, key);
    }

    Node inset_n_el(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (key < root.info)
            root.l_Node = inset_n_el(root.l_Node, key);
        else if (key > root.info)
            root.r_Node = inset_n_el(root.r_Node, key);

        return root;
    }

    void inorder() {
        inorder_set(root);
        System.out.println();
    }

    void inorder_set(Node root) {
        if (root == null) return;
        inorder_set(root.l_Node);
        System.out.print(root.info +" ");
        inorder_set(root.r_Node);

    }
}    
public class bst_sorting {
    public static void main(String[] args) throws Exception {
        int arr[] = { 25, 12, 23, 36, 10, 28, 30 };
        System.out.print("Before sorting = ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("After Sorting = ");
        BST the_tree = new BST();
        for (int i = 0; i < arr.length; i++) {
            the_tree.insert_element(arr[i]);
        }

        the_tree.inorder();

        }
}
        

