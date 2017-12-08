/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static int solution(int[] A, int[] B){
		double[] c=new double[A.length];
		for(int i=0;i<A.length;i++){
			c[i]=A[i]+(B[i]/(1000000.0));
		}
		int ans=0;
		for(int i=0;i<c.length;i++){
			for(int j=i+1;j<c.length;j++)
				if((c[i]*c[j])>=(c[i]+c[j]))
					ans++;
		}
		return ans;
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] a={0,1,2,2,3,5};
		int[] b={500000,500000,0,0,0,20000};
		System.out.println(solution(a,b));
		
	}
}