package example;
import java.util.Arrays;
public class ex_code68_69 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]d1= {1,2,3,4,5}, d2,d3;
		// 같이 입력해도 됨
		//int data1[], data2 이렇게 입력하면 data1만 배열이되고 data2는 정수가 됨.
		d2=d1;
		System.out.println(d1);
		System.out.println(d2);
		d3=d2;
		d2[2]=200; //< 이렇게 하면 d2의 2번째 배열 값이 200으로 바뀜
		//배열은 0,1,2,3으로 시작하므로 2번째 배열값은 입력한 3번째 값
		System.out.println(Arrays.toString(d3));
	}

}
