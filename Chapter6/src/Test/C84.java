package Test;

public class C84 {
//	public static void doSomething()
//	{
//		int x=10*100;
//	//	System.out.println(x);
//	//출력값이 없으니까 doSomething만해도 출력되지 않음
//	}//doSomething이 void라서 계산 및 int x가 안됨. int형으로 고쳐주기
	
	public static int doSomething()
	{
		int x= 10*100;
		return x;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		x= doSomething();
		System.out.println(x);
		int y=doSomething()+1000;
		System.out.println(y);
	}

}
