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
		
		int max, min, sum=0 ;
		if(score1<score2) {
			max=score2;
			min=score1;
		}else {
			max=score1;
			min=score2;			
		}
		
		int []arr1= {max-min}  ;
		
		System.out.print("결과 : ");
				
		for(int i= min;i<=max;i++) {
			for(int j=0;j<arr1.length;j++) {
				arr1[j]=i;
			}
			for(int x: arr1) {
				System.out.print(x+" ");
				sum+=x;
			}
			
			}
		System.out.println(" ");
		System.out.println("합계 :"+sum);
		
		
		
				
		sc.close();
	}
}
