package section4;

import java.util.Scanner;

public class C51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("점수를 입력하시오 :");
		int n = s.nextInt();
		char grade;
		switch(n) {
		case 90:
		grade='A';
		break;
		case 80:
		grade='B';
		break;
		case 70:
		grade='C';
		break;
		default:
		grade='D';
		}
		System.out.println(grade+"입니다.");
		s.close();
	}

}
