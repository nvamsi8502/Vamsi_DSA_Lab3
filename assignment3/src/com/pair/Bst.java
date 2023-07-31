package com.pair;

public class Bst {
	public TreeNode root;

    public TreeNode insert(TreeNode root, int key) {
        if (root == null) {
            return new TreeNode(key);
        }

        if (key < root.val) {
            root.left = insert(root.left, key);
        } else if (key > root.val) {
            root.right = insert(root.right, key);
        }

        return root;
    }

    public void insert(int key) {
        root = insert(root, key);
    }

}
