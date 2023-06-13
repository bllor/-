package example;

import java.util.Scanner;

public class ExC86 {
	public static boolean check(int n)
	{
		if(n%2==0) {
			return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Enter n:");
		int a=s.nextInt();
		check(a);
		if(check(a)==true) {
			System.out.println(a+"는 짝수");
		}else {
			System.out.println(a+"는 홀수");
		}
		s.close();
	}

}
