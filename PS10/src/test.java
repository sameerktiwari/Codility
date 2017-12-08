
public class test {
	
	public static int solution(int[] A, int[] B, int M, int X, int Y){
		int sum=0,nos=0,ans=0;
		String str="";
		for(int i=0;i<A.length;i++){
			while((sum+A[i]<=Y) && (nos<X)){
				sum+=A[i];
				nos++;
				if(str.indexOf(B[i]+"")==-1){
					str+=B[i];
				}
				i++;
				if(i==A.length){
					break;
				}
				
			}
			i--;
			sum=0;
			ans+=str.length()+1;
			nos=0;
			str="";
		}
		return ans;
	}
	
	public static void main(String[] args) {
		int[] a1={60,80,40};
		int[] b1={2,3,5};
		int x1=2,y1=200,m1=5;
		int[] a2={40,40,100,80,20};
		int[] b2={3,3,2,2,3};
		int x2=5,y2=200,m2=3;
		int[] a3={60,80};
		int[] b3={2,3};
		int x3=2,y3=200,m3=5;
		System.out.println(solution(a1, b1, m1, x1, y1));
		System.out.println(solution(a2, b2, m2, x2, y2));
		System.out.println(solution(a3, b3, m3, x3, y3));
	}

}
