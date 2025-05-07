package com.patterns;
import java.util.*;

public class BackTracking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,2,7,9,5,6,8,3,1};
		List<Integer> comb = new ArrayList<>();
		List<List<Integer>> results = new ArrayList<>();
		boolean[] visited = new boolean[arr.length];
		findCombinationsSumsToTarget(arr, 7, results, comb, visited, 0);
		System.out.println(results);
	}
	
	private static List<List<Integer>> findCombinationsSumsToTarget(int[] arr, int target, List<List<Integer>> results, List<Integer> combinations, boolean[] visited, int start) {
		if(findSum(combinations) == target) {
			results.add(new ArrayList<>(combinations));
		}else {
			for(int i = 0; i < arr.length; i++) {
				if(!visited[i]) {
					visited[i] = true;
					combinations.add(arr[i]);
					findCombinationsSumsToTarget(arr, target, results, combinations, visited, i+1);
					combinations.remove(Integer.valueOf(arr[i]));
					visited[i] = false;
				}
			}
		}
		return results;
	}
	
	private static int findSum(List<Integer> nums) {
		int sum = 0;
		for(int n : nums) {
			sum += n;
		}
		return sum; 
	}

}
