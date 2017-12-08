import java.util.ArrayList;


public class Test {

	public static int solution(int[] A){
		ArrayList<Integer> list=new ArrayList<>();
		int prev=0,last=0;
		for(int i=0;i<A.length;i++){
			if(A[i]==-1){
				i=prev;
				last=1;
			}
			prev=A[i];
			list.add(A[i]);
		}
		if(last==1){
			list.add(-1);
			return list.size();
		}
		return list.size();
	}
	
	public static void main(String[] args) {
		int[] a={1,4,-1,3,2};
		System.out.println(solution(a));
	}

}
