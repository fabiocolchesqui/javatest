package com.javatest.smallvalue;

import java.util.Arrays;

public class QuickSelectAlg {

	public static void main(String[] args) {
		int[] arr = { 45, 34, 78, 3, 7, 14, 24 };
		QuickSelectAlg.run(arr);
	}

	public static void run(int[] arr) {
		System.out.println("Array: " + Arrays.toString(arr) + "\n");

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Smallest from array = " + arr[quickSelect(arr, 0, arr.length - 1, i)]);
		}
	}

	private static int quickSelect(int[] a, int first, int last, int k) {
		if (first >= last) {
			return first;
		}
		int pivot = partition(a, first, last);
		if (k < pivot) {
			return quickSelect(a, first, pivot, k);
		}
		if (k > pivot) {
			return quickSelect(a, pivot + 1, last, k);
		}
		return first;
	}

	private static int partition(int[] a, int first, int last) {
		int right = calculate(a, first, last);
		swap(a, first, right);
		return right;
	}

	private static int calculate(int[] a, int first, int last) {
		int left = first;
		int right = last;
		int pivot = a[first];

		while (left < right) {
			while (pivot >= a[left] && left < right) {
				left++;
			}
			while (pivot < a[right]) {
				right--;
			}

			if (left < right) {
				swap(a, left, right);
			}
		}
		return right;
	}

	private static void swap(int[] a, int left, int right) {
		int temp = a[left];
		a[left] = a[right];
		a[right] = temp;
	}

}
