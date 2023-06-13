package section4;

import java.util.Scanner;

public class Code49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("정수1을 입력하세요");
		int a=s.nextInt();
		System.out.print("정수2를 입력하세요");
		int b=s.nextInt();
		System.out.print("정수3을 입력하세요");
		int c=s.nextInt();//어디서 변수를 받아오는지 적어야함 s에서 받아와서 s.nextIint();

		if(a<b||a<c) {
			if(b>c) {
				System.out.println(b+"이 제일 큰 수 입니다.");	
			}else if(c>b){
				System.out.println(c+"이 제일 큰 수 입니다.");
			}
			
		}else {
			System.out.println(a+"이 가장큰 수 입니다.");
		}
			
		s.close();
	}

}
