package java_miniProject;

import java.util.Scanner;

/*
 * 날짜:2023/6/19
 * 이름:최동일
 * 내용:숫자 정렬과 종합 계산 프로그램 짜기
 */

public class x_Project3 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("숫자를 5개 입력하시오.");
		int score1= sc.nextInt();
		int score2= sc.nextInt();
		int score3= sc.nextInt();
		int score4= sc.nextInt();
		int score5= sc.nextInt();
		int[]arr1= {score1,score2,score3,score4,score5};

		int max;
		for(int i=0;i<arr1.length;i++) {
			for(int j=i;j<arr1.length;j++) {
				if(arr1[i]<arr1[j]) {
					
					max=arr1[j];
					arr1[j]=arr1[i];
					arr1[i]=max;
					}
				}
			}
				for(int c:arr1) {
					System.out.print(c);
					}
		sc.close();
	}
}
