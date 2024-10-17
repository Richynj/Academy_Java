package com.bptn.course._21_Sorting_algorithms;

public class InsertionSort {
	static void insertionSort(int[] array) {
		  int size = array.length;
		  // outer loop for each index
		  for (int i = 1; i < size; i++) {
		   int key = array[i];
		   int j = i - 1;
		   // inner loop to compare and swap
		   while (j >= 0 && array[j] > key) {
		    array[j + 1] = array[j];
		    j = j - 1;
		   }
		   array[j + 1] = key;
		  }
		 }
}

