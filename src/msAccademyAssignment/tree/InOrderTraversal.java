package msAccademyAssignment.tree;

//Definition for a binary tree node.
//class TreeNode {
// int val;
// TreeNode left;
// TreeNode right;
// TreeNode(int x) { val = x; }
//}

public class InOrderTraversal {
 // Inorder traversal function
 public void inorderTraversal(TreeNode node) {
     if (node == null) {
         return;
     }
     
     // Traverse the left subtree
     inorderTraversal(node.left);
     // Visit the root node
     System.out.print(node.val + " ");
     // Traverse the right subtree
     inorderTraversal(node.right);
 }
 
 public static void main(String[] args) {
     // Example usage
     InOrderTraversal tree = new InOrderTraversal();
     TreeNode root = new TreeNode(1);
     root.left = new TreeNode(2);
     root.right = new TreeNode(3);
     root.left.left = new TreeNode(4);
     root.left.right = new TreeNode(5);
     
     System.out.println("Inorder traversal of binary tree is:");
     tree.inorderTraversal(root);
 }
}

