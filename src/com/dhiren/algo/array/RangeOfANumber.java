package com.dhiren.algo.array;

public class RangeOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {0,2,3,3,3,10,10};
		findRange(arr, 6);
	}

	private static void findRange(int[] arr, int num) {
		// TODO Auto-generated method stub
		
		int low = 0;
		int high = arr.length - 1;
		int mid = 0;
		
		while( high >= low ){
			
			mid = low + ((high - low)/2);
			if(arr[mid] == num)
				break;
			else if (arr[mid] > num)
				high = mid - 1;
			else
				low = mid + 1;
		}
		
		if(high < low){
			System.out.println("Num not found" + -1);
			
			return;
		}
		
		int right = mid, left = mid;
		while(right < arr.length - 1 && arr[right + 1] == num){
			right ++;
		}
		
		while(left > 1 && arr[left - 1] == num){
			left --;
		}
		
		System.out.println("(" + left + "," + right + ")");
	}

}
