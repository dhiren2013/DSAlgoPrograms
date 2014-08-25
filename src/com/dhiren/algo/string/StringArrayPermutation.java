package com.dhiren.algo.string;

import java.util.ArrayList;
import java.util.Arrays;

public class StringArrayPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] arr = {"1","2"};
		ArrayList<String[]> permutatedStr = permutations(arr);
		
		for(String[] permuStr : permutatedStr){
		
			System.out.println("Permutation of " + Arrays.toString(arr) +": " + Arrays.toString(permuStr));								
		}		
	}

	public static ArrayList<String[]> permutations(String[] arrStr){
		
		ArrayList<String[]> permutateStr = new ArrayList<String[]>();
		permutation(arrStr, 0, permutateStr);
		
		return permutateStr;
	}

	public static void permutation(String[] arr, int pos, ArrayList<String[]> list) {
		// TODO Auto-generated method stub
		
		if(arr.length - pos == 1){
			list.add(arr.clone());
		}
		else{
			for(int i=pos; i<arr.length; i++){
				swap(arr, pos, i);
				permutation(arr, pos + 1, list);
				swap(arr, pos, i);
			}
		}
		
		for(String[] permArr : list){
			
			System.out.println("each permutated List arr : " + Arrays.asList(permArr));
		}
	}

	public static void swap(String[] arr, int pos1, int pos2) {
		// TODO Auto-generated method stub
		
		String h = arr[pos1];
		arr[pos1] = arr[pos2];
		arr[pos2] = h;
	}
}
