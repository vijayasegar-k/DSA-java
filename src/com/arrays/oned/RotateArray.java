package com.arrays.oned;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,8,6,3,2,1,9};
		rotateLeft(arr);
		rotateRight(arr);
		
		System.out.println(Arrays.toString(arr));
	}
	
	private static void rotateLeft(int[] arr) {
		int start = arr[0];
		for(int i = 0; i < arr.length-1; i++) {
			arr[i] = arr[i+1];
		}
		arr[arr.length-1] = start;
	}
	
	private static void rotateRight(int[] arr) {
		int end = arr[arr.length-1];
		for(int i = arr.length-1; i>0; i--) {
			arr[i] = arr[i-1];
		}
		arr[0] = end;
	}

}
