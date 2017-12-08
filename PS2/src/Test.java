class IntList {
			  public int value;
			  public IntList next;
}

public class Test {

	public static int solution(IntList L){
		int size=0;
		while(L!=null){
			size++;
			L=L.next;
		}
		return size;
	}
	
	public static void main(String[] args) {
		IntList l1=new IntList();
		IntList l2=new IntList();
		IntList l3=new IntList();
		IntList l4=new IntList();
		l1.value=1;
		l1.next=l2;
		l2.value=2;
		l2.next=l3;
		l3.value=3;
		l3.next=l4;
		l4.value=4;
		System.out.println(solution(l1));
	}

}
