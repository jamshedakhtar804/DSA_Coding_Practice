package msAccademyAssignment.tree;

import java.util.Stack;

//Definition for a binary tree node.
//class TreeNode {
// int val;
// TreeNode left;
// TreeNode right;
// TreeNode(int x) { val = x; }
//}

public class PostOrderTraversalWithoutRecursion {
 // Iterative postorder traversal function
 public void postorderTraversal(TreeNode root) {
     if (root == null) {
         return;
     }
     
     Stack<TreeNode> stack1 = new Stack<>();
     Stack<TreeNode> stack2 = new Stack<>();
     
     stack1.push(root);
     while (!stack1.isEmpty()) {
         TreeNode node = stack1.pop();
         stack2.push(node);
         
         if (node.left != null) {
             stack1.push(node.left);
         }
         if (node.right != null) {
             stack1.push(node.right);
         }
     }
     
     while (!stack2.isEmpty()) {
         TreeNode node = stack2.pop();
         System.out.print(node.val + " ");
     }
 }
 
 public static void main(String[] args) {
     // Example usage
     PostOrderTraversalWithoutRecursion tree = new PostOrderTraversalWithoutRecursion();
     TreeNode root = new TreeNode(1);
     root.left = new TreeNode(2);
     root.right = new TreeNode(3);
     root.left.left = new TreeNode(4);
     root.left.right = new TreeNode(5);
     
     System.out.println("Postorder traversal of binary tree is:");
     tree.postorderTraversal(root);
 }
}

