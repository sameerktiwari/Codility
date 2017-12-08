
public class Test {
	
	public static int solution(int A,int B){
		int c=A*B,count=0;
		String str=Integer.toBinaryString(c);
		char[] a=str.toCharArray();
		for(char ch: a){
			if(ch=='1')
				count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		int a=3;
		int b=7;
		System.out.println(solution(a, b));
	}

}
