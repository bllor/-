package Test;
//{3,5,1,9,8}배열에 10씩 더하는 매서드를 나타내라
//한줄에 다 출력할 수 있게 만들어라.
//변환값은 void와 int[] 2가지를 만들어라.
import java.util.Arrays;
public class C87 {
	public static void	baeyeol(int[]b)
	{
		for(int i=0;i<b.length;i++) {
			b[i]+=10;
		}
	}
	public static int[] plusten(int[]c)
	{
		for(int i=0;i<c.length;i++) {
			c[i]+=10;
		}
		return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []A={3,5,1,9,8},b={3,5,1,9,8},c,d ;
		System.out.println(Arrays.toString(A));
		//C=new.baeyeol(A);처럼하면 배열을 받을 수 없음
		baeyeol(A);//void형태라서 받을 수 없음
		System.out.println(Arrays.toString(A));
		System.out.println(Arrays.toString(b));
		c=plusten(b);//plusten이 배열형태이므로 new int[]를안해줘도됨.
		//d= {1,23,3,4,5};을 추가할 때는 new int[]를 해줘야함
		d= new int[]{1,23,3,4,5};
		System.out.println(Arrays.toString(c));
	}

}
