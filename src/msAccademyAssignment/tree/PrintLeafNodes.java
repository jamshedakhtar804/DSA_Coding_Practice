package msAccademyAssignment.tree;

//Definition for a binary tree node.
//class TreeNode {
// int val;
// TreeNode left;
// TreeNode right;
// TreeNode(int x) { val = x; }
//}

public class PrintLeafNodes {
 // Function to print all leaf nodes
 public void printLeaves(TreeNode node) {
     if (node == null) {
         return;
     }
     
     if (node.left == null && node.right == null) {
         System.out.print(node.val + " ");
     }
     
     printLeaves(node.left);
     printLeaves(node.right);
 }
 
 public static void main(String[] args) {
     // Example usage
     PrintLeafNodes tree = new PrintLeafNodes();
     TreeNode root = new TreeNode(1);
     root.left = new TreeNode(2);
     root.right = new TreeNode(3);
     root.left.left = new TreeNode(4);
     root.left.right = new TreeNode(5);
     
     System.out.println("Leaves of binary tree are:");
     tree.printLeaves(root);
 }
}
