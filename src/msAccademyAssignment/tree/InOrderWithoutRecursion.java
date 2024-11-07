package msAccademyAssignment.tree;

import java.util.Stack;

//Definition for a binary tree node.
//class TreeNode {
// int val;
// TreeNode left;
// TreeNode right;
// TreeNode(int x) { val = x; }
//}

public class InOrderWithoutRecursion {
 // Iterative inorder traversal function
 public void inorderTraversal(TreeNode root) {
     Stack<TreeNode> stack = new Stack<>();
     TreeNode current = root;
     
     while (current != null || !stack.isEmpty()) {
         // Reach the leftmost node of the current node
         while (current != null) {
             stack.push(current);
             current = current.left;
         }
         
         // Current must be null at this point
         current = stack.pop();
         System.out.print(current.val + " ");
         
         // Visit the right subtree
         current = current.right;
     }
 }
 
 public static void main(String[] args) {
     // Example usage
     InOrderWithoutRecursion tree = new InOrderWithoutRecursion();
     TreeNode root = new TreeNode(1);
     root.left = new TreeNode(2);
     root.right = new TreeNode(3);
     root.left.left = new TreeNode(4);
     root.left.right = new TreeNode(5);
     
     System.out.println("Inorder traversal of binary tree is:");
     tree.inorderTraversal(root);
 }
}

