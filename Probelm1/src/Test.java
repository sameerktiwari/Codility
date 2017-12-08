import java.util.Arrays;


public class Test {

	public static boolean solution (int[] A){
		if(A.length==1)
			return true;
		int[] b=new int[A.length];
		for(int i=0;i<A.length;i++){
			b[i]=A[i];
		}
		Arrays.sort(A);
		int count=0;
		for(int i=0;i<A.length;i++){
			if(A[i]!=b[i]){
				count++;
			}
		}
		if(count==2)
			return true;
		else 
			return false;			
	}
	
	public static void main(String[] args) {
		int[] a1={1,5,3,3,7};
		int[] a2={5,4,3,2};
		System.out.println(solution(a1));
		System.out.println(solution(a2));
	}

}
