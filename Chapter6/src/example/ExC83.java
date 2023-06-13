package example;

public class ExC83 {
	public static void sqaure(int a, int b)
	{
		int result=1;
		for(int x=1; x<=b;x++) {//for 다음에 ;가 오면 for문이 정지됨
			result*=a;}
			System.out.println(result);
	}//반환값이 없으므로 출력으로 끝이 난다.
	public static int s(int x, int y)
	{
		int result=1;
		for(int i=1;i<=y;i++)
		{
		result*=x;
		}
		System.out.println(result);
		return result;
		//얘도 return으로 값만 받아준다면 출력이 뜨게 나타나는 것 같다.
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=2, d=10;
		sqaure(c,d);
		s(c,d);
		System.out.println(s(c,d)+100);
		//(s(c,d)+100)가 된다는 것은 s가 int형이라는 것
//		z=s(c,d);
//		System.out.println("s: "+z);
		
	}

}
