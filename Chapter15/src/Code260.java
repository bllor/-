/*
 * 날짜: 23/06/25
 * 이름: 최동일
 * 내용: 스레드 우선순위 확인
 */


class priority extends Thread{
	
	String name;
	priority(String name){
		this.name = name;
	}
	
	public void run() {
		System.out.println(name+"Starting");
		try {
			
			for(int i =1;i<=5;i++) {
				Thread.sleep(300);
				System.out.println("ln"+name+":"+i+"(priority:"+getPriority()+")");
			}
		}catch(InterruptedException e) {
			System.out.println(e);
		}
		System.out.println(name+"terminating");
	}
}

public class Code260 {

	public static void main(String[] args) {
		System.out.println("main starting");
		
		Thread th = new priority("Priority Thread");
		th.start();
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(300);
				System.out.println("In main"+i); 
				
			}catch(InterruptedException e) {
				System.out.println(e);
			}
			
		}
		System.out.println("main ending");
	}
	
}
