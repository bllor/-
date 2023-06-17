import java.util.Iterator;
import java.util.TreeSet;

/*
 * 날짜:2023/6/17
 * 이름:최동일
 * 내용:TreeSet
 */
/*
 * 1.TreeSet
 * 트리셋은 트리 구조 중에서 이진 트리 구조 형태를 취한다.
 * 그래서 데이터를 어떤 형식으로 넣어도 정렬된 형태로 나온다.
 * (이진트리구조: 데이터를 저장하면서 자동으로 정렬의 형태를 취함)
 * 
 */
public class Code242 {
	public static void main(String[] args) {
		int A[]= {4,31,12,14,5,3,2,45,4,3};
		TreeSet<Integer> ts= new TreeSet<>();
		for(int i=0; i<A.length;i++) {
			ts.add(A[i]);}
			System.out.println(ts);
		
		
		Iterator<Integer> its=ts.iterator();
		while(its.hasNext()) {
			System.out.print(its.next()+" ");
		}
	}
}
