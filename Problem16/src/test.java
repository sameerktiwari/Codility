
public class test {
	
	public static int solution(int N){
		String str=Integer.toBinaryString(N);
		int index=-1,flag=0,count=0;
		for(int i=0;i<str.length();i++){
			index=str.indexOf(str.substring(0,i+1),i+1);
			if(index>=0){
				count++;
				flag=1;
			}
		}
		if(flag==1){
			for(int i=count;i<str.length();i+=count){
			if(str.length()-i<count){
				if(str.indexOf(str.substring(0, str.length()-i), i)>0)
					return count;
			}
			if(!(str.indexOf(str.substring(0, count), i)>0))
				return -1;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		System.out.println(solution(955));
		System.out.println(solution(18));
		System.out.println(solution(7));
		System.out.println(solution(15));
	}

}
