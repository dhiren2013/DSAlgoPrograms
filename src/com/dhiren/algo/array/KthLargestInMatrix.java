package com.dhiren.algo.array;

public class KthLargestInMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matrix = {
					{ 5, 7, 8, 9},
					{ 6, 9, 10, 13 },
					{ 7, 11, 12, 15 },
					{ 8, 13, 16, 17 }
		};
		
		int result = findKthLargest(matrix, 8);
		System.out.println("The kth largest element is " + result);
	}
	
	private static int findKthLargest(int[][] matrix, int k){
		
		for(int i = 0; i< k - 1; ++i)
			reArrange(matrix, matrix.length - 1, matrix[0].length - 1);
		
		return matrix[matrix.length - 1][matrix[0].length - 1];
	}

	private static void reArrange(int[][] matrix, int row, int coln) {
		// TODO Auto-generated method stub
		
		int newRow = 0;
		int newColn = 0;
		
		if(row == 0 && coln == 0)
		{
			matrix[row][coln] = Integer.MIN_VALUE;
			return;
		}else if(row == 0){
			
			newRow = row;
			newColn = coln - 1;
		}else if (coln == 0){
			
			newRow = row - 1;
			newColn = coln;
		}else if (matrix[row][coln - 1] > matrix[row - 1][coln]){
			
			newRow = row;
			newColn = coln - 1;
		}else{
			
			newRow = row - 1;
			newColn = coln;
		}
		
		matrix[row][coln] = matrix[newRow][newColn];
		reArrange(matrix, newRow, newColn);
	}

}
