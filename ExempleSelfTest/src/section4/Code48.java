package section4;

import java.util.Scanner;

public class Code48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("정수를 입력하시오 :");
		int a=s.nextInt();
		System.out.print("정수를 입력하시오 :");
		int b=s.nextInt();
		if(a>b) {
			System.out.println("a가 더 큰 수 입니다.");
		}
		else {
			System.out.println("b가 더 큰 수 입니다.");
		}
		s.close();
	}

}
