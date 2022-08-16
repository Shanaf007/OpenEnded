import java.util.ArrayList;
import java.util.Scanner;
public class Solution {
	static int catchThieves(char arr[],int n,int k)
	{
		ArrayList<Integer> th = new ArrayList<Integer>();
	    ArrayList<Integer> p = new ArrayList<Integer>();
	    
	    for(int i=0;i<n;i++) {
	    	if(arr[i]=='P')
	    		p.add(i);
	    	else
	    		th.add(i);
	    }
	    
	    int s_t=0;
	    int s_p=0;
	    
	    int ans =0;
	    
	    while(s_t < th.size() && s_p < p.size() ) {
	    	if(Math.abs(th.get(s_t) - p.get(s_p)) <= k) {
	    		ans++;
	    		s_t++;
	    		s_p++;
	    	}
	    	else if (th.get(s_t) < p.get(s_p))
	    		s_t++;
	    	else
	    		s_p++;
	    		
	    }
	    
	    return ans;
	}
	
	public static void main(String args[])
	  {
		 int k, n; char arr1[] = new char[] { 'P', 'T', 'T', 'P', 'T' };
		 k = 2;
		 n = arr1.length; 
		 System.out.println("Maximum thieves caught: " +catchThieves(arr1, n, k));

		 char arr2[] = new char[] { 'T', 'T', 'P', 'P', 'T', 'P' };
		 k = 2;
		 n = arr2.length;
		 System.out.println("Maximum thieves caught: " + catchThieves(arr2, n, k));

		 char arr3[] = new char[] { 'P', 'T', 'P', 'T', 'T', 'P' };
		 k = 3;
		 n = arr3.length;
		 System.out.println("Maximum thieves caught: " + catchThieves(arr3, n, k));
	    
	    
	  }
	

}
