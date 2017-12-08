
public class Test {
	
	public static int solution(int[] A){
		int sum=Integer.MAX_VALUE;
		for(int i=0;i<A.length;i++){
			int sum2=0;
			for(int j=i;j<A.length;j++){
				sum2+=A[j];
				sum=Math.abs(sum2)<sum? Math.abs(sum2):sum;
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		int[] a={2,-4,6,-3,9};
		System.out.println(solution(a));
	}

}
