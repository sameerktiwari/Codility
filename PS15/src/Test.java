import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;


public class Test {

	public static int solution(String s){
		char[] a=s.toCharArray();
		int count1=0,count2=0;
		for(int i=0;i<a.length;i++){
			if(a[i]=='(')
				count1++;
			else
				count2++;
		}
		int c1=0,c2=0;
		for(int i=0;i<a.length;i++){
			if(a[i]=='(')
				c1++;
			else if(a[i]==')')
				c2++;
			if(c1==(count2-c2))
				return i+1;
		}
		return 0;
	}
	
	public static void main(String[] args) {
		String s1="(())))(";
		String s2=")))((())";
		System.out.println(solution(s1));
		System.out.println(solution(s2));
		
	}

}
