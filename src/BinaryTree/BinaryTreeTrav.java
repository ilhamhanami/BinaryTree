package BinaryTree;



import static BinaryTree.BinaryTreeNode.visit;
import jdk.nashorn.internal.ir.CatchNode;
public class BinaryTreeTrav implements Cloneable {

    private BinaryTreeNode root;

    public Object root() {
        return root;
    }

    public static void preOrder(BinaryTreeNode t) {
        if (t != null) {
            visit(t);
            preOrder(t.leftChild);// do left subtree
            preOrder(t.rightChild);// do right subtree
        }
    }

    public static void inOrder(BinaryTreeNode t) {
        inOrder(t.leftChild); //do left subtree
        visit(t); // visit tree root
        inOrder(t.rightChild); // do right subtree
    }

    public void postOrder() {
        postOrder(root);
    }

    public static void postOrder(BinaryTreeNode t) {
        if (t != null) {
            postOrder(t.leftChild); // do left subtree
            postOrder(t.rightChild); // do right subtree
            visit(t); // visit tree root

        }
    }

    public void insert(int data) {
        root = insert(root, data);
    }

    private BinaryTreeNode insert(BinaryTreeNode node, Object data) {
        if (node == null) {
            node = new BinaryTreeNode(data);
        } else {
            if (node.rightChild == null) {
                node.rightChild = insert(node.rightChild, data);
            } else {
                node.leftChild = insert(node.leftChild, data);
            }
        }
        return node;
    }

    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new Error("Data tidak bisa di clone");
        }

    }

}
