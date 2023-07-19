package Day6;

public class LinearSearch {
	public static void main(String[] args) {
		int[] arr = {40, 10, 20, 50, 30};
		int target = 20;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				System.out.println("Element found at index : " + i);
				System.exit(0);
			}
		}
		System.out.println("Element not found");
	}
}
