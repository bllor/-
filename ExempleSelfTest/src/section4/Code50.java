package section4;

import java.util.Scanner;

public class Code50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("성적을 입력하시오.");
		int score= s.nextInt();
		if(score>90) {
			if(score>95) {
				System.out.print("A+");
			}else {
			System.out.print("A");
			}
		}else if(score>80) {
			System.out.print("B");
		}else {
			System.out.print("C");
		}
		
		s.close();
		
	}

}
