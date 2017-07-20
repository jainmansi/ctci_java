package recursionanddynamicprogramming;

public class MagicIndex_WithDups {
	public static void main(String[] args) {
		int[] input = {-10, -5, 2, 2, 2, 3, 4, 7, 9, 12, 13};
		System.out.println(getMagicIndex(input));
	}
	
	public static int getMagicIndex(int[] arr) {
		return magicFast(arr, 0, arr.length - 1);
	}
	
	public static int magicFast(int[] arr, int start, int end) {
		if(end < start) return -1;
		
		int midIndex = (start + end) /2;
		int midValue = arr[midIndex];
		
		if(midIndex == midValue)
			return midIndex;
		
		int leftIndex = Math.min(midValue, midIndex - 1);
		int left = magicFast(arr, start, leftIndex);
		if(left >= 0)
			return left;
		
		int rightIndex = Math.max(midValue, midIndex + 1);
		int right = magicFast(arr, rightIndex, end);
		
		return right;
	}
}
