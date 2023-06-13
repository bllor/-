package example;
//메서드 오버로딩: 같을 클래스 내에 같은 이름의 메소드를 여러가지 가질 수 있는 특징

public class ExC91 {
	static void overMethod()
	{
		System.out.println("no");
	}
	static void overMethod(int x)
	{
		System.out.println("one"+x);
	}
	static void overMethod(int x, int y)
	{
		System.out.println("two"+x+y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=19, y=20;
		overMethod();
		overMethod(x);
		overMethod(x,y);
		}

}
