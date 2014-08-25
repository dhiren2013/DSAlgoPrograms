package com.dhiren.algo.binarytree;

import java.util.Scanner;

public class NoOfBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int inputNode = input.nextInt();
				
		int noOfBinaryTree = countBinaryTree(inputNode);
		System.out.println("No of binary tree are " + noOfBinaryTree);
	}

	public static int countBinaryTree(int N){
		
		if(N<=1)
			return(1);
		else
		{
			int sum = 0;
			int left, right, root;
			
			for(root=1; root<=N; root++){
				
				left = countBinaryTree(root - 1);
				right = countBinaryTree(N - root);
				
				sum += left*right;
			}
			
			return sum;
		}
		
	}
}
