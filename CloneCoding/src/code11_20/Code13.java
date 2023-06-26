package code11_20;
/*
 * 날짜:23/06/26
 * 이름:최동일
 * 내용:54p예제
 */
public class Code13 {

	public static void main(String[] args) {
		byte b1 =126, b2=-127;
		
		System.out.println(b1);
		b1++;
		System.out.println(b1);
		b1++;
		System.out.println(b1);
		System.out.println("----------");
		System.out.println(b2);
		b2--;
		System.out.println(b2);
		b2--;
		System.out.println(b2);
		//byte의 범위인 -128~127을 넘어가게 되면 127의 경우 -128이, -128의 경우 127로 돌아간
	}
}
