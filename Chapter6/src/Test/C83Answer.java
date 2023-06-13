package Test;
//x의 y제곱을 나타낼 수 있는 매서드를 만든 후
//2의 10제곱을 표현하시오.
public class C83Answer {
	public static void square(int x,int y)
	{ int sum=1;
		for(int i=1;i<=y;i++) {
			 sum*=x;
		}
		System.out.println(x+"의 "+y+"제곱은 "+sum+"이다.");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=2, y=10;
		square(x,y);
	}

}
