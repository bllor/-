package java_miniProject;

import java.util.Scanner;

public class Project2 {
	public static void main(String[] args) {
		int i=1, sum=0, average=0;
//		Scanner sc= new Scanner(System.in);
//		int x= sc.nextInt();
//	
		
		for(;;) {
			Scanner sc= new Scanner(System.in);
			System.out.print("정수를 입력하세요: ");
			int x= sc.nextInt();
			
			if(x==0) {
				break;
			}
			sum+=x;
			average= sum/i++;
		}
		System.out.printf("합계는 %d입니다. 평균은 %d입니다.",sum,average);
		
	}
}
