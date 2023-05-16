class NodeTree {
    private NodeTree leftChild, rightChild;

    public NodeTree(NodeTree leftChild, NodeTree rightChild) {
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    public NodeTree getLeftChild() {
        return this.leftChild;
    }

    public NodeTree getRightChild() {
        return this.rightChild;
    }

    public int height() {
        return height(0);
    }

    private int height(int d) {
        int l = d;
        int r = d;
        if(leftChild != null)
            l = leftChild.height(d+1);
        if(rightChild != null)
            r = rightChild.height(d+1);
        return Math.max(l, r);
    }

    public static void main(String[] args) {
        NodeTree leaf1 = new NodeTree(null, null);
        NodeTree leaf2 = new NodeTree(null, null);
        NodeTree nodeTree = new NodeTree(leaf1, null);
        NodeTree root = new NodeTree(nodeTree, leaf2);

        System.out.println(root.height());
    }
}