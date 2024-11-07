package msAccademyAssignment.tree;

//Definition for a binary tree node.
//class TreeNode {
// int val;
// TreeNode left;
// TreeNode right;
// TreeNode(int x) { val = x; }
//}

public class CountOfLeafNodes {
 // Function to count leaf nodes
 public int countLeaves(TreeNode node) {
     if (node == null) {
         return 0;
     }
     
     if (node.left == null && node.right == null) {
         return 1;
     }
     
     return countLeaves(node.left) + countLeaves(node.right);
 }
 
 public static void main(String[] args) {
     // Example usage
     CountOfLeafNodes tree = new CountOfLeafNodes();
     TreeNode root = new TreeNode(1);
     root.left = new TreeNode(2);
     root.right = new TreeNode(3);
     root.left.left = new TreeNode(4);
     root.left.right = new TreeNode(5);
     
     int leafCount = tree.countLeaves(root);
     System.out.println("Number of leaf nodes in binary tree: " + leafCount);
 }
}

