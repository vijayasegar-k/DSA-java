package com.patterns;

public class FastSlowPointers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		
		int r = findMid(arr);
		System.out.println(r);
	}
	
	private static int findMid(int[] arr) {
		int l = 0;
		int r = 0;
		
		while(l < arr.length-1 && r < arr.length-1) {
			l = l+2;
			r++;
		}
		
		return arr[r];
	}
}
