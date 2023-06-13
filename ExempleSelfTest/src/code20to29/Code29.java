package code20to29;

public class Code29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,d;
		a=10; b=20; c=5; d=a+b+c;
		c=++c;
		System.out.println("a="+(++a));//+++a로 사용은 안된다.
		System.out.println("b="+--b);
		System.out.println("c="+c);
		System.out.println("d="+d);
		
	}

}
