package Test;

import java.util.Scanner;

//매개변수와 반환값이 모두 있는 경우
//매개변수의 합을 int형으로 받을 수 있는 매서드를 만들어라.
//두 변수를 입력 받은 후 입력받은 변수로 합을 구하라.
public class C85_Answer {

	public static int add(int x, int y)
	{
		int result=x+y;
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.print("Enter n:");
		int a=s.nextInt();
		int b=s.nextInt();
		int c= add(a,b);
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		s.close();
		
	}

}
