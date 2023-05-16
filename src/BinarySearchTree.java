class Node {
    public int value;
    public NodeTree left, right;

    public Node(int value, NodeTree left, NodeTree right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
}

public class BinarySearchTree {
    public static boolean contains(NodeTree root, int value) {
        if(root == null)
            return false;
        if(root.value == value)
            return true;
        if (value <= root.value)
            return contains(root.left, value);
        if (value > root.value)
            return contains(root.right, value);
        return false;
    }

    public static void main(String[] args) {
        NodeTree n1 = new NodeTree(1, null, null);
        NodeTree n3 = new NodeTree(3, null, null);
        NodeTree n2 = new NodeTree(2, n1, n3);

        System.out.println(contains(n2, 3));
    }
}