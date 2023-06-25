/*
 * 날짜: 23/06/25
 * 이름: 최동일
 * 내용: 스레드  조절하기(join()함수 사용)
 * 		스레드가 끝난 뒤 메인스레드가 종료하게 만드는법
 */
class ChildThread2 extends Thread{
	
	public void run() {
		for(int i= 1 ;i<=10;i++) {
			System.out.println(i);
		}
	}
}
public class Code259 {
	public static void main(String[] args) {
		Thread th = new ChildThread2();
		
		th.start();
		for(char ch='a';ch<='z';ch++) {
			System.out.println(ch);
			try {
				th.join();
			}catch(InterruptedException e) {
				System.out.println(e);
			}
		}
		System.out.println("Main thread ending");
	}

}
