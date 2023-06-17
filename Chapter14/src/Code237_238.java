import java.util.Stack;

/*
 * 날짜:2023/6/17
 * 이름:최동일
 * 내용:Stack 실습
 */
/*
 * 1.Stack
 * -한쪽 끝에서만 데이터의 추가/삭제가 일어나는 구조.
 * -제일 마지막에 들어간 데이터가 제일 먼저 쓰인다.
 * -매소드
 * 		boolena empty 스택이 비었는지 확인
 * 		peek() 스택 탑에 있는 원소를 반환함.
 * 		pop() 스택 탑에 있는 원소를 삭제하고 반환함.
 * 		push(변수.x)x를 변수에 추가함
 * 		int search(x) x의 위치를 찾음
 */
public class Code237_238 {
	public static void main(String[] args) {
		Stack<Integer> s= new Stack<Integer>();
		s.add(1);
		s.add(2);  //인덱스 번호4
		s.add(3);
		s.add(4); //인덱스 번호2
		s.add(5); //인덱스 번호1
		int index= s.search(4); //4가 들어있는 인덱스 번호 찾기
		System.out.println(index);
		int index2= s.search(2);
		System.out.println(index2);
		int data= s.peek();
		System.out.println("가장 상위에 있는 값: "+data);
		while(!s.empty()) {
			System.out.println(s.pop());
			//s.pop는 스택에 가장 높이 있는 원소들을 반환하면서 삭제하므로 차례대로 출력할 수 있다.
		}
		
	}
}
