package com.bridgelabz.algorithm;
import java.util.Arrays;
public class BinarySearch {

	public void binarySearch(String[] array, int low, int high, String data) {

        int mid = (low + high) / 2;

        System.out.println(" ( " + low + " " + mid + " " + high + " )");
        if (data.equals(array[mid])) {
                System.out.println(" Found the word");
                return;
        }
        
        if (mid == low || mid == high) {
        	System.out.println(" We did not find the word ");
        	return;
        }

        else if (data.compareTo(array[mid]) > 0)
                binarySearch(array, mid, high, data);
        else
                binarySearch(array, low, mid, data);
}	
	public static void main(String[] args) {
		String[] array = {"hi", "there", "these", "are", "random", "words", "in", "an", "array"};
		BinarySearch binary = new BinarySearch();
		Arrays.sort(array);
		
		binary.binarySearch(array, 0, array.length, "hi");
	}


	}


