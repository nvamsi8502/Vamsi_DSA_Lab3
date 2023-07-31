package com.pair;

public class Main {

	public static void main(String[] args) {
		 Bst bst = new Bst();
	        int[] keys = {10, 20, 30, 40, 50, 60, 70};

	        for (int key : keys) {
	            bst.insert(key);
	        }

	        int targetSum = 130;
	        Pair.findPairWithSum(bst.root, targetSum);
	    }
	}

	


