package section4;

import java.util.Scanner;

public class Code49Answer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("3개의 정수를 입력하시오.");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		//값1 값2 값3처럼 띄어쓰기를 하여 입력하면 a=값1,b=2,c=3이 저장됨
		//숫자를 더 입력하면 가장 먼저 입력한 애들만 출력되고, 적게 입력하면 다음 단계로 넘어가지 않음
		//위와 같은 식으로 하면 3개의 정수를 입력 받을 수 이있음
		int max=0;
		if(a>b) {
			max=a;
		}else {//else는 if의 조건이 끝난 다음에 붙여야함
			max=b;
		}
		if(c>max) {
		max=c;}
		System.out.println(max+"가 가장 큰 수 이다.");
		s.close();
	}

}
