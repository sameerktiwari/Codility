import java.util.Arrays;


public class Test {

	public static int solution(int[] A){
		Arrays.sort(A);
		String str="";
		for(int i: A)
			str+=i;
		int count=0;
		for(int i=0;i<str.length();i++){
			int j=i;
			while(str.indexOf(str.charAt(i),j+1)>0){
				count++;
				j++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
			int[] a={3,5,6,3,3,5};
			System.out.println(solution(a));
	}

}
