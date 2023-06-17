import java.util.ArrayList;
import java.util.Iterator;

/*
 * 날짜:2023/6/17
 * 이름:최동일
 * 내용:ArrayList
 */

public class Code233_234_235 {
	public static void main(String[] args) {
//		내용추가
		ArrayList<String>number = new ArrayList<String>();
		number.add("1");
		number.add("2");
		number.add("3");
		number.add("4");
		number.add("5");
		
		for(int i=0;i<number.size();i++) {
			System.out.println(number.get(i));
		}
		System.out.println("----------------");
		
//		저장한 데이터 변경 및 수정
		number.set(0, "one");//number의 0번째 배열의 값을 one으로 바꾼다.
		number.set(3, "four");//number의 3번째 배열의 값을 four으로 바꾼다.
		number.remove(2);//number의 2번째 인덱스를 삭제한다.
						 //2번 인덱스가 삭제 되면 3번인덱스가 2번 인덱스 자리에 위치한다.
		number.remove("5");//인덱스 값 중 5를 가진 배열을 삭제한다.
		for(int i=0;i<number.size();i++) {
			System.out.println(number.get(i));
		}
		System.out.println("----------------");
		
//		반복자(iterator)를 이용하여 출력하기.
		
		Iterator<String> iter= number.iterator();
		while(iter.hasNext()) {//hasNext는 리스트에 다음 연산자가 있는지 판단
			String t= iter.next();
			System.out.println(t);
		}
	}
}
