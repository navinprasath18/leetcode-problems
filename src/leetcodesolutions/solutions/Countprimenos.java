package leetcodesolutions.solutions;

import java.util.stream.IntStream;

public class Countprimenos {

	public static void main(String[] args) {
		countPrimes(10);

	}
	
	
	 public static int countPrimes(int n) {
	        
		 int count= n-2;
	        if(n==1)
	            return 0;
	        if(n==2)
	            return 1;
	        for(int i=2;i<=n;i++)
	        {
	            for(int j=2;j<=i/2;j++)
	            {
	                if(i%j==0)
	                {
	                    count--;
	                    System.out.println(i);
	                    break;
	                }
	                
	            }
	        }
	       return count;

}
}
