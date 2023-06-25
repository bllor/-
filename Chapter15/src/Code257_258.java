/*
 * 날짜: 23/06/25
 * 이름: 최동일
 * 내용: 스레드  조절하기(isAlive()함수사용)
 * 		스레드가 끝난 뒤 메인스레드가 종료하게 만드는법
 */


class ChildThread extends Thread{
	public void run() {
		for(int i=0;i<=26;i++) {
			System.out.println(i);
		}
	}
}
public class Code257_258 {

	public static void main(String[] args) {
		Thread th = new ChildThread();
		
		th.start();
		int i= 1;
		do {
			System.out.print("*");
			i++;
		}while(th.isAlive());
	}
}
