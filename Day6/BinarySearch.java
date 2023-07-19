package Day6;

import java.util.Arrays;

public class BinarySearch {
	
	public static void main(String[] args) {
		int[] arr = {40, 10, 20, 50, 30};
		int target = 30;
		
		// Binary search algorithm only works if the array is sorted
		Arrays.sort(arr);
		
		boolean result = binarySearch(arr, target);
		if(result) {
			System.out.println("Element found");
		} else {
			System.out.println("Element not found");
		}
	}
	
	public static boolean binarySearch(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (target == arr[mid]) {
				return true;
			} else if (target > arr[mid]) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return false;
	}
}
