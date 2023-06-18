package java_miniProject;

import java.util.Scanner;

/*
 * 날짜:2023/6/19
 * 이름:최동일
 * 내용:성적관리 프로그램 짜기
 */
public class x_Project1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("성적을 입력하시오. : ");
		int score= sc.nextInt();
		char grade ;
		if(score>=90) {
			grade = 'A';
		}else if(score>=80){
			grade = 'B';
		}else if(score>=70){
			grade = 'D';
		}else if(score>=60){
			grade = 'E';
		}else {
			grade='F';
		}
		System.out.printf("당신의 등급은 %s 입니다",grade);
		sc.close();
	}
}
