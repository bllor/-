package section4;

import java.util.Scanner;

public class C57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Enter n: ");
		int a=s.nextInt();
		int n=1,i;
		for(i=1;i<a;i++){
			if(a%i==0) {
				n=i;
			}
		}
		
		if(1<n&&n<a) {
			System.out.println(a+"은 복수입니다.");
		}else {
			System.out.println(a+"은 소수입니다.");
		}
		s.close();
	}

}
