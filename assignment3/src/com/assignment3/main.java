package com.assignment3;

public class main {

	
		public static void main(String[] args) {
	        String[] sampleInputs = {
	            "( [ [ { } ] ] )",
	            "( [ [ { } ] ] ) )"
	        };

	        for (String inputString : sampleInputs) {
	            boolean result = isBalancedBrackets(inputString);
	            if (result) {
	                System.out.println("The entered String has Balanced Brackets");
	            } else {
	                System.out.println("The entered Strings do not contain Balanced Brackets");
	            }
	        }
	    }

		private static boolean isBalancedBrackets(String inputString) {
			// TODO Auto-generated method stub
			return false;
		}
	
	



	}


