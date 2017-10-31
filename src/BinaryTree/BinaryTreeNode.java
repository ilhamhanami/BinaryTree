package BinaryTree;

public class BinaryTreeNode {
       
    Object element;
    BinaryTreeNode leftChild; // left subtree  
    BinaryTreeNode rightChild; // right subtree
    
    public static void visit(BinaryTreeNode t){
        System.out.print(t.element+" ");
    }
    
    public BinaryTreeNode(){
        
    }
    public BinaryTreeNode(Object data){
        this.element = data;
               
    }
    public BinaryTreeNode(Object theElement, BinaryTreeNode theleftChild, BinaryTreeNode therightChild){
        element = theElement;
        leftChild = theleftChild;
        rightChild = therightChild;
       
    }
   
}

