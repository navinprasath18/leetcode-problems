package leetcodesolutions.solutions;

import java.util.Arrays;

public class SquaresOfSortedArray {
	
	
	public static void main(String[] args) {
		
		int[] nums = {-7,-3,2,3,11};
		for(int i:sortedSquares(nums))
		System.out.print(i+" ");
		
	}
	
	
	 public static int[] sortedSquares(int[] nums) {
		 int[] sol = new int[nums.length];
		
		 for(int i=0;i<nums.length;i++)
		 {
			 sol[i]= nums[i]*nums[i];
		 }
		  Arrays.sort(sol);
		  return sol;
	        
	    }

}
