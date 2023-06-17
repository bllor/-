import java.util.LinkedList;
import java.util.Queue;

/*
 * 날짜:2023/6/17
 * 이름:최동일
 * 내용:Queue 실습
 */
/*
 * 1.QUEUE
 * -한 쪽에서 데이터가 추가되고 반대 쪽에서 데이터를 삭제하는 구조.
 * -가장먼저 입력된 데이터를 먼저 출력한다.
 * -매서드
 * 		add() 추가
 * 		element() 큐의 헤드에 있는 원소를 반환함.
 * 		offer() 원소를 추가함
 * 		peek() 큐의 헤드에 있는 값을 반환함. 삭제는 하지 않음. 비었을 경우 null 출력
 * 		poll() 큐의 헤드에 있는 원소를 반환하고 삭제함. 비었을 경우 null 출력
 * 		remove() 큐의 헤드에 있는 원소를 반환하고 삭제함.
 */
public class Code239 {
	public static void main(String[] args) {
		Queue<Integer> q= new LinkedList<Integer>();
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		q.add(50);
		q.offer(60);
		
		Integer x= q.element();
		System.out.println("가장 먼저들어간 값은: "+x);
		
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
		
	}
}
