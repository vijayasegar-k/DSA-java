package com.patterns;
import java.util.*;

public class TwoPointers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7,8,9};
		List<int[]> results = twoSum(arr, 8);
		
		results.stream().forEach(ar -> System.out.println(Arrays.toString(ar)));
	}
	
	public static List<int[]> twoSum(int[] arr, int target){
		List<int[]> results = new ArrayList<>();
		Arrays.sort(arr);
		int l = 0, r = arr.length-1;
		
		while(l < r) {
			int sum = arr[l] + arr[r];
			
			if(sum == target) {
				int[] ar = new int[2];
				ar[0] = arr[l];
				ar[1] = arr[r];
				results.add(ar);
				l++;
				r--;
			}else if(sum < target) {
				l++;
			}else {
				r--;
			}
		}
		return results;
	}

}
