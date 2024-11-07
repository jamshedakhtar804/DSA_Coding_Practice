package msAccademyAssignment.tree;

//Definition for a binary tree node.
//class TreeNode {
// int val;
// TreeNode left;
// TreeNode right;
// TreeNode(int x) { val = x; }
//}

public class PostOrderTraversal {
 // Postorder traversal function
 public void postorderTraversal(TreeNode node) {
     if (node == null) {
         return;
     }
     
     // Traverse the left subtree
     postorderTraversal(node.left);
     // Traverse the right subtree
     postorderTraversal(node.right);
     // Visit the root node
     System.out.print(node.val + " ");
 }
 
 public static void main(String[] args) {
     // Example usage
     PostOrderTraversal tree = new PostOrderTraversal();
     TreeNode root = new TreeNode(1);
     root.left = new TreeNode(2);
     root.right = new TreeNode(3);
     root.left.left = new TreeNode(4);
     root.left.right = new TreeNode(5);
     
     System.out.println("Postorder traversal of binary tree is:");
     tree.postorderTraversal(root);
 }
}

