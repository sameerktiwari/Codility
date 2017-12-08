
public class Test {
	
	static int solution(int A[]){
		int p=0,q=0,r=0,flag=0,ans=0;
		for(int i=1;i<A.length;i++){
			if(A[i]<A[i-1] && flag==0){
				p=A[i-1];
				flag=1;
			}
			else if(A[i]<A[i-1] && flag==1){
				continue;
			}
			else if(A[i]>A[i-1] && flag==1){
				q=A[i-1];
				flag=2;
			}
			else if(A[i]<=A[i-1] && flag==2){
				r=A[i-1];
				flag=0;
				ans=ans>(((p-q)>(r-q))? r-q: p-q)? ans: (((p-q)>(r-q))? r-q: p-q);
				i--;
			}
			else if(A[i]>A[i-1] && flag==2){
				if(i==A.length-1){
					r=A[i];
					ans=ans>(((p-q)>(r-q))? r-q: p-q)? ans: (((p-q)>(r-q))? r-q: p-q);
				}
				else
					continue;
			}
			else{
				flag=0;
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		int[] a={0,1,3,-2,0,1,0,-3,2,3};
		System.out.println(solution(a));
	}

}
