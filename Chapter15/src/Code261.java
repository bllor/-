/*
 * 날짜: 23/06/25
 * 이름: 최동일
 * 내용: 스레드 우선순위 부여하기
 */


class Priority2 implements Runnable{
	
	Thread thrd;
	static String currentName;
	int count;
	static boolean stop = false;
	
	Priority2(String name){
			thrd = new Thread(this, name);
			count =0;
			currentName = name;
	}
	public void run() {
		System.out.println(thrd.getName()+" starting");
		do {
			count++;
		}while(stop==false&&count<1000000);
		stop=true;
		System.out.println(thrd.getName()+" terminating"); 
		
	}
}

public class Code261 {

	public static void main(String[] args) {
		Priority2 p1= new Priority2("Max");
		Priority2 p2= new Priority2("Min");
		Priority2 p3= new Priority2("Norm");
	
		p1.thrd.setPriority(Thread.MAX_PRIORITY);
		p2.thrd.setPriority(Thread.MIN_PRIORITY);
		p3.thrd.setPriority(Thread.NORM_PRIORITY);
		
		p1.thrd.start();
		p2.thrd.start();
		p3.thrd.start();
	
		
		try {
			p1.thrd.join();
			p2.thrd.join();
			p3.thrd.join();
		}catch(InterruptedException e) {
			System.out.println(e);
		}
		
		System.out.println("\nHigh priority count :"+p1.count); 
		System.out.println("Min priority count :"+p2.count); 
		System.out.println("Norm priority count :"+p3.count); 
	
	}
}
