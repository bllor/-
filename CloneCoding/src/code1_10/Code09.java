package code1_10;
/*
 * 날짜:23/06/26
 * 이름:최동일
 * 내용:48p예제
 */
public class Code09 {

	public static void main(String[] args) {
		
		boolean x = true;
		boolean y= false;
		
		System.out.println(x);
		System.out.println(y);
		
		x= 5>10;
		//x에는 true가 저장이 되어있는데  5>10은 false이므로 출력값이 false가 나온다.
		System.out.println(x);
		
		y=5<10;
		//y에는 false가 저장되어있고, 5<10이 false이므로 true가 출력이 된다.
		System.out.println(y);
	}
}
