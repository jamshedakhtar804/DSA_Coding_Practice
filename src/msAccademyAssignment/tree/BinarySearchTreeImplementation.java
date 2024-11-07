package msAccademyAssignment.tree;


class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

class BinarySearchTreeImplementation {
    Node root;

    // Method to insert a new value
    void insert(int key) {
        root = insertRec(root, key);
    }

    // Recursive method to insert a new value
    Node insertRec(Node root, int key) {
        // If the tree is empty, return a new node
        if (root == null) {
            root = new Node(key);
            return root;
        }

        // Otherwise, recur down the tree
        if (key < root.data) {
            root.left = insertRec(root.left, key);
        } else if (key > root.data) {
            root.right = insertRec(root.right, key);
        }

        // return the unchanged root pointer
        return root;
    }

    // Method to search for a value
    boolean search(int key) {
        return searchRec(root, key);
    }

    // Recursive method to search for a value
    boolean searchRec(Node root, int key) {
        // Base cases: root is null or key is present at root
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }

        // Key is greater than root's key
        if (key > root.data) {
            return searchRec(root.right, key);
        }

        // Key is smaller than root's key
        return searchRec(root.left, key);
    }

    // Method to perform in-order traversal
    void inorder() {
        inorderRec(root);
    }

    // Recursive method for in-order traversal
    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }

    // Method to delete a value
    void delete(int key) {
        root = deleteRec(root, key);
    }

    // Recursive method to delete a value
    Node deleteRec(Node root, int key) {
        // Base case: if the tree is empty
        if (root == null) {
            return root;
        }

        // Recur down the tree
        if (key < root.data) {
            root.left = deleteRec(root.left, key);
        } else if (key > root.data) {
            root.right = deleteRec(root.right, key);
        } else {
            // Node with only one child or no child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // Node with two children: get the inorder successor (smallest in the right subtree)
            root.data = minValue(root.right);

            // Delete the inorder successor
            root.right = deleteRec(root.right, root.data);
        }

        return root;
    }

    // Utility method to find the minimum value in a tree
    int minValue(Node root) {
        int minv = root.data;
        while (root.left != null) {
            minv = root.left.data;
            root = root.left;
        }
        return minv;
    }

    // Main method for testing
    public static void main(String[] args) {
        BinarySearchTreeImplementation bst = new BinarySearchTreeImplementation();

        // Inserting values
        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);

        // In-order traversal
        System.out.println("In-order traversal of the given tree:");
        bst.inorder(); // Output: 20 30 40 50 60 70 80
        System.out.println();

        // Searching for a value
        int searchValue = 40;
        System.out.println("Search for value " + searchValue + ": " + bst.search(searchValue)); // Output: true

        // Deleting a value
        bst.delete(20);
        System.out.println("In-order traversal after deleting 20:");
        bst.inorder(); // Output: 30 40 50 60 70 80
        System.out.println();

        bst.delete(30);
        System.out.println("In-order traversal after deleting 30:");
        bst.inorder(); // Output: 40 50 60 70 80
        System.out.println();

        bst.delete(50);
        System.out.println("In-order traversal after deleting 50:");
        bst.inorder(); // Output: 40 60 70 80
    }
}

