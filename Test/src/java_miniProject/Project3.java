package java_miniProject;

import java.util.Scanner;

/*
 * 날짜:2023/6/19
 * 이름:최동일
 * 내용:숫자 정렬과 총합 계산 프로그램 짜기
 */

public class Project3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하시오.");
		int score1= sc.nextInt();
	
		System.out.println("숫자를 입력하시오.");
		int score2= sc.nextInt();
		
		int max, min;
		if(score1<score2) {
			max=score2;
			min=score1;
		}else {
			max=score1;
			min=score2;			
		}
		
		int []arr1;
		
		for(int i= min;i<=max;i++) {
			arr1= new[] arr1[max-min];
			arr1[i]=i;
		}
		
		sc.close();
	}
}
