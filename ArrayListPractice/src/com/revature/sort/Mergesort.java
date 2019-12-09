package com.revature.sort;

import java.util.Arrays;

public class Mergesort {
	
	private static void merge(int[] arr, int[] left, int[] right) {
		int One = 0; // left counter		
		int Two = 0; // right counter
		int j = 0; // holder for arrays
		
		
		while(One < left.length && Two < right.length) {
			//iterate through array with counters
			//adding values to both arrays
			if(left[One] < right[Two]) {
				arr[j] = left[One];
				One++;
			}else {
				arr[j] = right[Two];
				Two++;
			}
			j++;
		}
		System.arraycopy(left, One, arr, j, left.length - One); // copy left array to j
		System.arraycopy(right, Two, arr, j, right.length - Two); // copy right array to j
		
	}
		public static void sort(int[] arr) { // sort method
			if(arr.length == 1) {
				
			}else {
				int[] left = new int[arr.length/2]; // left array is half the length of the total
				int[] right = new int[arr.length - left.length]; // right array is remaining half
				System.arraycopy(arr, 0, left, 0, left.length);//copy values from initial point to left
				System.arraycopy(arr, left.length, right, 0, right.length);//copy values to right
				
				sort(left);//sort left half
				sort(right);//sort right half
				merge(arr, left, right);//merge result of sorting
			}
			
			}
		public static void main(String[] args) {
			int[] arr = {7, 12, 20, 3, 18, 11, 15};//array to sort
			sort(arr);//sort method
			System.out.println(Arrays.toString(arr));//print array to display

		}	
}
