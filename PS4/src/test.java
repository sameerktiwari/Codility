
public class test {
	
	public static int solution(int[] A){
		int count=0,flag=0,temp=0,ans=-1;
		for(int i=0;i<A.length-1;i++){
			if(A[i]==A[i+1]){
				flag=1;
				temp++;
			}
			else{
				if(flag==1){
					temp++;
					if(count<temp){
						count=temp;
						ans=A[i];
					}
				}
				temp=0;
				flag=0;
			}
		}
		return count>=((A.length/2)+1)? ans: -1;
	}
	
	public static void main(String[] args) {
		int[] a={2,2,2,2,2,3,4,4,4,6};
		int[] b={1,1,1,1,4};
		
		System.out.println(solution(a));
		System.out.println(solution(b));
	}

}
