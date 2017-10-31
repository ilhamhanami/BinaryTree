
public class TestingClone {

    public static void main(String[] args) {

        BTNode root = createTree();
        if (root == null) {
            return;
        }
        BTNode newR = new BTNode();
        cloneMyTree(root, newR);
        printTree(newR);

    }

    private static BTNode cloneMyTree(BTNode root, BTNode newR) {
        if (root == null) {
            return null;
        }
        BTNode leftSubNode = null;
        BTNode rightSubNode = null;

        if (!(root.left == null)) {
            leftSubNode = new BTNode();
            cloneMyTree(root.left, leftSubNode);
        }

        if (!(root.right == null)) {
            rightSubNode = new BTNode();
            cloneMyTree(root.right, rightSubNode);
        }

        newR.left = leftSubNode;
        newR.right = rightSubNode;
        newR.value = root.value;

        return root;

    }

    public static void printTree(BTNode root) {
        if (root == null) {
            System.out.println("NULL");
            return;
        } else {
            System.out.println(root.value);
            System.out.println("Left of " + root.value);
            printTree(root.left);

            System.out.println("right of " + root.value);
            printTree(root.right);
        }

    }

    public static BTNode createTree() {
        BTNode myTree = new BTNode();
        myTree.root = new BTNode(1);

        myTree.root.left = new BTNode(2);
        myTree.root.left.left = new BTNode(4);
        myTree.root.left.right = new BTNode(5);

        myTree.root.right = new BTNode(3);
        myTree.root.right.left = new BTNode(6);
        myTree.root.right.right = new BTNode(7);
        return myTree.root;

    }
}
