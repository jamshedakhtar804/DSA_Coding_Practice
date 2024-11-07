package msAccademyAssignment;

class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int val) {
        this.val = val;
    }
}

public class ConvertSortedArrayToBST {

    // Function to convert sorted array to BST
    public static TreeNode sortedArrayToBST(int[] nums) {
        return convertArrayToBST(nums, 0, nums.length - 1);
    }

    // Recursive helper function to build the BST
    private static TreeNode convertArrayToBST(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }

        // Middle element becomes the root
        int mid = left + (right - left) / 2;
        TreeNode root = new TreeNode(nums[mid]);

        // Recursively build the left and right subtrees
        root.left = convertArrayToBST(nums, left, mid - 1);
        root.right = convertArrayToBST(nums, mid + 1, right);

        return root;
    }

    // In-order print function to verify BST structure
    public static void inorderPrint(TreeNode node) {
        if (node == null) return;
        inorderPrint(node.left);
        System.out.print(node.val + " ");
        inorderPrint(node.right);
    }

    public static void main(String[] args) {
        // Example sorted array
        int[] nums = {-10, -3, 0, 5, 9};

        TreeNode root = sortedArrayToBST(nums);

        // Print the BST in in-order to verify correctness
        System.out.print("In-order traversal of the BST: ");
        inorderPrint(root);
    }
}
