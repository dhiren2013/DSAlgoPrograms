package com.dhiren.algo.array;

public class FindOccurrenceInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num = { 1, 13, 42, 42, 42, 77, 78 };
		
		printIndicesOfNumber(num, 42);
		//System.out.println("First Index : " );
	}
	
	
	public static void printIndicesOfNumber(int[] array, int target){
		
		if(array == null)
			return;
		
		int low = 0, high = array.length - 1;
	
		/* Get the start index of the target element. */
		
		int startIndex = -1;
		while(low <= high){
			
			int mid = (high - low )/2 + low;
			if(array[mid] > target){
				
				high = mid - 1;
			}else if(array[mid] == target){
				
				startIndex = mid;
				high = mid - 1;
			}else 
				low = mid + 1;
		}
		
		/* Get the last index of the target element. */
		int endIndex = -1;
		low = 0;
		high = array.length - 1;
		while(low <= high){
			
			int mid = (high - low)/2 + low;
			if(array[mid] > target){
				
				high = mid - 1;
			}else if(array[mid] == target){
				
				endIndex = mid;
				low = mid + 1;
			}else
				low = mid + 1;
		}
		
		if(startIndex != -1 && endIndex != -1){
			for(int i = 0; i+startIndex <= endIndex; i++){
				if(i>0)
					System.out.println(',');
				System.out.println(i + startIndex);
			}
		}
	}

}
