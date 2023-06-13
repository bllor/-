package code30to39;

public class Code30_31_32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int a=10, b=13, c, d, e;
	c=a&b;
	d=a|b;
	e=a^b;
	System.out.println(c);
	System.out.println(d);
	System.out.println(e);
	}

}
/*
비트연산자 &(=and),|(=or),^(=not)
비트연산자란 정수를 이진수로 바꾸어 계산함.
&은 같은 자리 숫자가 둘다 1인 경우 1, 아니면 0
|은 같은 자리 숫자중 하나만 1이여도 1
^은 같은 자리 숫자 둘다 1이면 0, 하나만 1이면 1인 것
11=1011
13=1101
11&13 ->1001=9
11|13 ->1111=15
11^13 ->0110=8
*/