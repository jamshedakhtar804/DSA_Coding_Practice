package msAccademyAssignment.tree;

import java.util.Stack;

//Definition for a binary tree node.
//class TreeNode {
// int val;
// TreeNode left;
// TreeNode right;
// TreeNode(int x) { val = x; }
//}

public class PreOrderWithoutRecursion {
 // Iterative preorder traversal function
 public void preorderTraversal(TreeNode root) {
     if (root == null) {
         return;
     }
     
     Stack<TreeNode> stack = new Stack<>();
     stack.push(root);
     
     while (!stack.isEmpty()) {
         TreeNode node = stack.pop();
         System.out.print(node.val + " ");
         
         // Push right child first so that left child is processed first
         if (node.right != null) {
             stack.push(node.right);
         }
         if (node.left != null) {
             stack.push(node.left);
         }
     }
 }
 
 public static void main(String[] args) {
     // Example usage
     PreOrderWithoutRecursion tree = new PreOrderWithoutRecursion();
     TreeNode root = new TreeNode(1);
     root.left = new TreeNode(2);
     root.right = new TreeNode(3);
     root.left.left = new TreeNode(4);
     root.left.right = new TreeNode(5);
     
     System.out.println("Preorder traversal of binary tree is:");
     tree.preorderTraversal(root);
 }
}

