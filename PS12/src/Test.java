
public class Test {
	
	public static int solution(String s){
		String[] a=s.split("[0-9]+");
		int ans=-1;
		for(String str: a){
			if(str.matches(".*[A-Z]")){
				ans=ans>str.length()? ans: str.length();
			}
				
		}
		return ans;
	}
	
	public static void main(String[] args) {
		String s1="a12345acD124abcD";
		String s2="a0bb";
		System.out.println(solution(s1));
		System.out.println(solution(s2));
	}

}
