/*
 * 날짜: 23/06/25
 * 이름: 최동일
 * 내용: 2개의 스레드에 이름 붙이기
 */

class NumberThread6 extends Thread{
	String name;
	NumberThread6(String name){
		this.name= name;
	}
	public void run() {
	try {
		Thread.sleep(300);
		for(int i = 1; i<10; i++) {
			System.out.println("In"+name+":"+i);
		}
	}catch(InterruptedException e) {
		System.out.println(e);
		}
		System.out.print(name+"terminating");
	}
}


class CharThread implements Runnable {
	String name;
	CharThread(String name){
		this.name = name;
	}
	public void run() {
		System.out.println(name+"starting");
		try {
			Thread.sleep(300);
			for(char ch ='a';ch<='z';ch++) {
				System.out.println(ch); 
				
			}
		}catch(InterruptedException e) {
			System.out.print(e); 
			
		}
		System.out.println(name+"terminating");
	}
}

public class Code256 {

	public static void main(String[] args) {
		System.out.println("Main Starting");
		Thread th1 = new NumberThread6("Number Thread");
		Thread th2 = new Thread( new CharThread("Char Thread"));
		
		th1.start();
		th2.start();
		
		for(int i=0;i<=10;i++) {
			try {
				
				Thread.sleep(300);
				System.out.println("In Main"+i);
			}catch(InterruptedException e) {
				System.out.println(e);
			}
		}
		System.out.println("Main Ending");
		
		
		
	}
}
