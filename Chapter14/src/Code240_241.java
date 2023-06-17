import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/*
 * 날짜:2023/6/17
 * 이름:최동일
 * 내용:Iterator와 ListIterator 실습
 */
/*
 * Iterator는 한방향으로만 출력이 되지만, ListIterator는 양방향으로 출력이 가능하다.
 */
public class Code240_241 {
	public static void main(String[] args) {
		ArrayList<Integer> i= new ArrayList<Integer>();
		i.add(1);
		i.add(2);
		i.add(3);
		i.add(4);
		i.add(5);
		
		//1.Iterator
		Iterator<Integer>ii=i.iterator();
		while(ii.hasNext()) {
			System.out.println(ii.next());
		}
		//ii가 배열의 맨끝에 존재하지만 출력을 하면 처음부터 하게 되어있다.
		System.out.println("--------------");
		ii= i.iterator();
		while(ii.hasNext()) {
			System.out.println(ii.next());
		}
		System.out.println("--------------");

		
		//2.ListIterator
		ListIterator<Integer> l= i.listIterator();
		//정방향 출력
		while(l.hasNext()) {
			System.out.println(l.next());
		}
		System.out.println("--------------");
		//역방향 출력
		while(l.hasPrevious()) {
			System.out.println(l.previous());
		}
		System.out.println("--------------");
	}
}
