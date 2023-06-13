package section4;

import java.util.Scanner;

public class Code47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int x= scin.nextln();이거 단독으로 사용안됨/
		//Scanner scin은 scin은 Scanner의 변수라는 뜻
		//Scanner scin= new Scanner(System.in);
		Scanner scin = new Scanner(System.in);
		System.out.print("정수를 입력하세요 :");
		int x= scin.nextInt();
		System.out.print("실수를 입력 하세요 :");
		double z = scin.nextDouble();
		System.out.print("이름을 입력 하세요 :");
		String a=scin.next();
		System.out.println("x :"+x);
		System.out.println("z :"+z);
		System.out.println("이름 :"+a);

		scin.close();//얘가 있어야 스캔이 시작됨
	}

}
