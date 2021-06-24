package leetcodesolutions.solutions;
// https://leetcode.com/problems/reverse-integer/submissions/
public class ReverseInt {

	public static void main(String[] args) {
		int num = 1534236469;
		System.out.print(reverse(num));
	}



public static int reverse(int x) {
	
	int sol = 0;
	while(x!=0 )
	{
		if(Long.valueOf(sol)*10+x%10 > Integer.MAX_VALUE || Long.valueOf(sol)*10+x%10 < Integer.MIN_VALUE)
			return 0;
		sol = sol*10+x%10;
		System.out.println(sol);
		x = x/10;
	}
	return sol;
    
}
}

