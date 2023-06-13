package code10to19;

public class Code15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1000, b=200;
		System.out.println(a*b);
		System.out.println((short)a*b);
		//a를 short로 바꾸더라도 b가 int라서 a*b는 (int)a*(int)b가 된다.
		System.out.println((short)(a*b));
		/*
		 System.out.println((short)(a*b));가 되면
		 a*b의 값이 short로 변환되는데 short의 범위를 넘어서므로
		 a*b의 원래 계산 값이 아닌 3392라는 값으로 출력된다.
		 */
		
	}

}
