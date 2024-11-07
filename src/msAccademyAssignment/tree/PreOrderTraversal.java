package msAccademyAssignment.tree;

//Definition for a binary tree node.
class TreeNode {
 int val;
 TreeNode left;
 TreeNode right;
 TreeNode(int x) { val = x; }
}

public class PreOrderTraversal {
 // Preorder traversal function
 public void preorderTraversal(TreeNode node) {
     if (node == null) {
         return;
     }
     
     // Visit the root node
     System.out.print(node.val + " ");
     // Traverse the left subtree
     preorderTraversal(node.left);
     // Traverse the right subtree
     preorderTraversal(node.right);
 }
 
 public static void main(String[] args) {
     // Example usage
     PreOrderTraversal tree = new PreOrderTraversal();
     TreeNode root = new TreeNode(1);
     root.left = new TreeNode(2);
     root.right = new TreeNode(3);
     root.left.left = new TreeNode(4);
     root.left.right = new TreeNode(5);
     
     System.out.println("Preorder traversal of binary tree is:");
     tree.preorderTraversal(root);
 }
}
