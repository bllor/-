/*
 * 날짜: 23/06/25
 * 이름: 최동일
 * 내용: 스레드메서드 인수인 sleep사용 예제
 */
/*
 * sleep()는 밀리세컨드단위로, 메서드의 출력을 지연할 때 사용한다.
 * Thread.sleep(1000)을하게 되면 1초 간격을 두고 출력이 된다.
 */

class NumberThread1 extends Thread{
	public void run() {
		for(int i=1;i<=26;i++) {
			System.out.print(i);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}

public class Code252 {

	public static void main(String[] args) {
		
		Thread t = new NumberThread1();
		t.start();
		for(char ch= 'a';ch<='z';ch++) {
			System.out.print(ch);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
