package com.pair;

public class Pair {
	public static void findPairWithSum(TreeNode root, int targetSum) {
        TreeNode leftNode = root, rightNode = root;
        boolean foundPair = false;
        while (rightNode.right != null) {
            rightNode = rightNode.right;
        }

        while (leftNode != null && rightNode != null && leftNode != rightNode && !foundPair) {
            int sum = leftNode.val + rightNode.val;

            if (sum == targetSum) {
                foundPair = true;
                break;
            } else if (sum < targetSum) {
                leftNode = leftNode.right;
            } else {
                rightNode = rightNode.left;
            }
        }

        if (foundPair) {
            System.out.println("Pair is (" + leftNode.val + ", " + rightNode.val + ")");
        } else {
            System.out.println("Nodes are not found.");
        }
    }

}
