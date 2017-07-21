package recursionanddynamicprogramming;

import java.util.ArrayList;
import java.util.List;

public class PowerSet {

	public static void main(String[] args) {
		
		int[] nums = {1, 2, 3};
		List<List<Integer>> resultSet = getSubset(nums);
		
		for(List<Integer> list : resultSet) {
			System.out.print("{");
			for(int i : list) {
				System.out.print(i + ",");
			}
			System.out.println("}");
		}
		
	}
	
	public static List<List<Integer>> getSubset(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();
		List<Integer> baseSet = new ArrayList<>();
		
		result.add(baseSet);
		
		for(int i : nums) {
			List<List<Integer>> temp = new ArrayList<>();
			
			for(List sub : result) {
				List<Integer> subset = new ArrayList<>(sub);
				subset.add(i);
				temp.add(subset);
			}
			result.addAll(temp);
		}
		return result;
	}
}
