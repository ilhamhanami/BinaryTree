package BinaryTree;

import java.util.Scanner;
public class DriverMain {
     public static void main(String[] args)
    {            
        Scanner scan = new Scanner(System.in);
        /* Creating object of BT */
        BinaryTreeTrav bt = new BinaryTreeTrav(); 
        /*  Perform tree operations  */
        System.out.println("Binary Tree Test\n");    
        bt.insert(0);
        bt.insert(1);
        bt.insert(2);
        bt.postOrder();
        System.out.println();
        BinaryTreeTrav ba = (BinaryTreeTrav) bt.clone(); 
        ba.postOrder();
        
    }
}
