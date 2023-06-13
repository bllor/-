package section4;

import java.util.Scanner;

public class Code49Correction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("3개의 정수를 입력하시오.");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		int max=0;
		if(a<b&&a<c) {
			if(b>c) {
				max=b;
			}else {
				max=c;
			}
		}else {
			max=a;
		}
		System.out.println(max+"이 제일 크다.");
		s.close();
	}

}
