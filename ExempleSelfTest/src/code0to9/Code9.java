package code0to9;

public class Code9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10, b=20 ;
		System.out.println(a>=b);
		//System.out.println(a>=b);처럼해도 true, false가 나온다.
		/*
		c=a>b;
		d=a<b;
		처럼 정의해서는 참, 거짓을 나타낼 수 없고,
		boolean c= true;, boolean d= false;등 c,d의 형태를 boolean으로 만들어줘야함*/
		boolean c= true, d= false, e;
		//boolean을 쓸 때 변수에 기본값을 주지 않아도 사용이 된다.
		c=a>b;
		d=a<b;
		e=a==b;
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
	}

}
