package section4;

import java.util.Scanner;

public class C54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=  new Scanner(System.in);
		System.out.println("정수를 입력하시오");
		int a= s.nextInt();
		int i=1;
		while(i<=a) {
			 if(a%i==0) {
				 //n=i;//a=i로 해도 될듯
				 //n이라는 변수를 하나 없엤음. i로 표현을 하면 될 것 같아서
				 System.out.print(i+" ");
					
			 }
			 i++;	
		}
		s.close();
	}

}
