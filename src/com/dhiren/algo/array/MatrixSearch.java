package com.dhiren.algo.array;

public class MatrixSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matrixArray = {
								{1,3,5,7},
								{10,11,16,20},
								{23,30,34,50}
							};
		
		boolean searchedElem = searchElemInMatrix(matrixArray, 16);
		System.out.println("The result : " + searchedElem);
	}
	
	// Method - 1
	public static boolean searchElemInMatrix(int[][] matrix, int target){
		
		if(matrix == null || matrix.length == 0 
				|| matrix[0].length == 0){
			return false;
		}
		
		int m = matrix.length;
		int n = matrix[0].length;
		
		int start = 0;
		int end = m * n - 1;
		
		while(start <= end){
			
			int mid = (start + end)/2;
			int midX = mid/n;
			int midY = mid % n;
			
			if(matrix[midX][midY] == target)
				return true;
			
			if(matrix[midX][midY] < target){
				
				start = mid + 1; 
			}else{
				end = mid - 1;
			}
		}
		
		return false;
	}

}
