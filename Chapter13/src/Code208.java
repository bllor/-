import java.util.Scanner;

public class Code208 {

	public static void main(String[] args) {
		
		Scanner scin= new Scanner(System.in);
		System.out.print("Name : ");
		String name=scin.next();
		System.out.print("Phone Number : ");
		String phone=scin.next();
		System.out.print("Age : ");
		int age=scin.nextInt();
		System.out.print("Height : ");
		float  Height=scin.nextFloat();
		System.out.print("Gender : ");
		char gender=scin.next().charAt(0);
		
		System.out.println(name);
		System.out.println(phone);
		System.out.println(age);
		System.out.println(Height);
		System.out.println(gender);
	
		scin.close();
	}
	
//	데이터의 구분자는 ' ', \n, \t가 있는데 이들을 토큰이라고 부른다.
}
