package example;
import java.util.Arrays;
public class ExC87 {
	static void updateArray(int[]B)
	{
		for(int a=0;a<B.length;a++){
		//a<=B.length가 되면 a가 B의 길이보다 더 많게 더해진다
		//배열은 0부터 시작되므로 배열의 length가 3이라는 것은 3개가 있고
		//이 숫자들은 0,1,2라는 숫자가 순차적으로 배열된다.
			B[a]+=10;
		}
	}
	 static int[] whyError(int[]c)
	{
		
		for(int a=0;a<c.length;a++) {
			c[a]+=10;
					}
		return c;

	}//그동안 에러가 났던 것이 대괄호의 에러였던 것...
	 //애가 상태가 안좋다는 생각이 들면 대괄호의 개수를 한번보자
	
	public static void main(String[]args)//public이라는 말이 없으면 실행 안됨.
	{
	 int b[]= {1,3,5};
	 System.out.println(Arrays.toString(b));
	 updateArray(b);
	 System.out.println(Arrays.toString(b));
	}
}
