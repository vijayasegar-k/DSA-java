package com.arrays.oned;
import java.util.*;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,11,6,4,9,2,5};
		quicksort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	
	private static void quicksort(int[] arr, int low, int high) {
		if(low < high) {
			int p = partition(arr, low, high);
			quicksort(arr, low, p-1);
			quicksort(arr, high, p+1);
		}
	}
	
	private static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int p = low -1;
		
		for(int i = low; i < high; i++) {
			if(arr[i] < pivot) {
				p++;
				swap(arr, i, p);
			}
		}
		
		swap(arr, p+1, high);
		return p+1;
	}
	
	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
