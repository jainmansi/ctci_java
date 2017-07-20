package recursionanddynamicprogramming;

public class MagicIndex {

	public static void main(String[] args) {
		int[] input = {-5, -1, 0, 3, 8, 13, 15,	17};
		System.out.println(getMagicIndex(input));
	}
	
	public static int getMagicIndex(int[] input) {
		int start = 0;
		int end = input.length;
		int mid = start + (end - start) / 2;
		
		while(start <= end) {
			if(input[mid] == mid)
				return mid;
			else if (input[mid] > mid) {
				end = mid - 1;
				mid = start + (end - start) /2;
			} else {
				start = mid + 1;
				mid = start + (end - start)/2;
			}
		}
		
		return -1;
	}
}
