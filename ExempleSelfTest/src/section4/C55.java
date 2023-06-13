package section4;

import java.util.Scanner;

public class C55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s =new Scanner(System.in);
		System.out.print("정수를 입력하시오");
		int a=s.nextInt();
		int i=1;
		while(i<=a) {
		
			System.out.println((a/i)%10);
			i*=10;
		}
		/*책에서는 while(a>0)
		{int m= n%10;
		System.out.print(m);
		n/=10;으로 표현했는데 이게 더 깔끔하고 직관적인 것 같음*/
			s.close();
//		int a=51234/100, b=10;
//		System.out.println(a%b);
	}

}
