/*
 * 날짜: 23/06/25
 * 이름: 최동일
 * 내용: 스레드에 이름 붙이기
 */

class NumberThread5 extends Thread{
	String name;
	NumberThread5(String name){
		this.name =name;
	}
	
	public void run() {
		System.out.println(name+"starting");
		try {
			for(int i=0;i<=10;i++) {
				Thread.sleep(300);
				System.out.print("In"+name+":"+i); 
				
			}
		}catch(InterruptedException e){
			System.out.println(e);
			//여기서 계속 에러가 났던 이유
			//겹치는 것에 대한 예외를 정하는데
			//Thread.sleep를 하지 않았기 때문
		}
		System.out.println(name+"terminating");
	}
}

public class Code255 {

	public static void main(String[] args) {
		Thread th = new NumberThread5("Number Thread");
		th.start();
		
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(300);
				System.out.println("In main"+i);
			}catch(InterruptedException e){
				System.out.println(e);
			}
			
		} 
		System.out.println("Main Ending");
	}
}