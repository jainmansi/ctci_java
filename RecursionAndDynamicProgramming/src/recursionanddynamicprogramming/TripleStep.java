package recursionanddynamicprogramming;

public class TripleStep {

	public static void main(String[] args) {
		System.out.println(getTotalSteps(10));
	}
	
	public static int getTotalSteps(int n) {
		int[] memo = new int[n+1];
		
		return getCount(n, memo);
	}
	
	public static int getCount(int n, int[] memo) {
		if(n < 0)
			return 0;
		if(n == 0)
			return 1;
		memo[n] = getCount(n-1, memo) + getCount(n-2, memo) + getCount(n-3, memo);
		
		return memo[n];
	}
}
