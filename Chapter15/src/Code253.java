/*
 * 날짜: 23/06/25
 * 이름: 최동일
 * 내용: 두 개의 스레드 객체 사용
 */

class NumberThread2 extends Thread{
	public void run() {
		for(int i=1;i<=26;i++) {
			System.out.print(i);
		}
	}
}

class NumberThread3 extends Thread{
	public void run() {
		for(char ch='a';ch<='z';ch++) {
			System.out.print(ch);
		}
	}
}

public class Code253 {

	public static void main(String[] args) {
		Thread t1= new NumberThread2();
		Thread t2= new NumberThread3();
		
		t1.start();
		t2.start();
		
		for(char ch='A';ch<='Z';ch++) {
			System.out.print(ch);
		}
		
	}
}
