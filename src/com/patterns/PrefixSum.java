package com.patterns;

import java.util.Arrays;

public class PrefixSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		prefixSum();
		checkIfEquilibrium();
	}
	
	private static void prefixSum() {
		int[] arr = {1,2,3,4,5};
		
		for(int i = 1; i < arr.length; i++) {
			arr[i] = arr[i-1] + arr[i];
		}
		
		System.out.println(Arrays.toString(arr));
	}
	
	private static void checkIfEquilibrium() {
		int[] arr = {4,3,1,5,5,3};
		
		int leftSum = 0, totalSum = 0, balancingIndex = -1;
		
		for(int i = 0; i < arr.length; i++) {
			totalSum += arr[i];
		}
		
		for(int i = 0; i < arr.length; i++) {
			totalSum -= arr[i];
			if(totalSum == leftSum) {
				balancingIndex = i;
				break;
			}
			leftSum += arr[i];
		}
		
		if(balancingIndex == -1) {
			System.out.println("No equi");
		}else {
			System.out.println("Equi at "+ balancingIndex);
		}
	}

}
