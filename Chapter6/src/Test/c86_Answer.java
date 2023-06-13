package Test;
//입력 받은 수가 짝수인지 소수인지 확인할 수 있는 매서드를 만들어라.

import java.util.Scanner;

public class c86_Answer {
	public static boolean check(int x)
	{
		if(x%2==0) {
			return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter n:");
		int a= s.nextInt();
		if(check(a)==true) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
		s.close();
		
	}

}
