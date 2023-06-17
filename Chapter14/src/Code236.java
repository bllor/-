import java.util.LinkedList;

/*
 * 날짜:2023/6/17
 * 이름:최동일
 * 내용:LinkedList 실습
 */

public class Code236 {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		for(int x: list) {
			System.out.println(x);
		}
	}
}
