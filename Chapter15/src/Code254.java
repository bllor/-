/*
 * 날짜: 23/06/25
 * 이름: 최동일
 * 내용: runnable인터페이스 예제
 */
/*
 * runnable인터페이스와 Thread클래스를 사용하는 방법 모두 수행결과에서는 차이가 없다.
 * Thread클래스 외에 다른 클래스를 상속 받아야 한다면 runnable 인터페이스를 사용하는 것이 좋다.
 */

class NumberThread4 implements Runnable {
	public void run() {
		for(int i = 1;i<=26;i++) {
			System.out.print(i); 
			
		}
	}
}

public class Code254 {

	public static void main(String[] args) {
		Thread t = new Thread(new NumberThread4());
		
		t.start();
		for(char ch ='a';ch<='z';ch++) {
			System.out.print(ch);
		}
	}
}
