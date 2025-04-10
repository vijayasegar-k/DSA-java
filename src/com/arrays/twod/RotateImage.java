package com.arrays.twod;

public class RotateImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		rotateRight(arr);
//		rotateLeft(arr);
		
		printArray(arr);
	}
	
	private static void printArray(int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	} 
	
	private static void transpose(int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = i; j < arr[0].length; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
	}
	
	private static void rotateRight(int[][] arr) {
		transpose(arr);
		for(int i = 0; i < arr.length; i++) {
			int l = 0, r = arr[0].length-1;
			while(l < r) {
				int temp = arr[i][l];
				arr[i][l] = arr[i][r];
				arr[i][r] =  temp;
				l++;r--;
			}
		}
	}
	
	private static void rotateLeft(int[][] arr) {
		transpose(arr);
		int l = 0, r = arr.length-1;
		while(l < r) {
			int[] temp = arr[l];
			arr[l] = arr[r];
			arr[r] = temp;
			l++; r--;
		}
	}

}
