package java_miniProject;

import java.util.Scanner;

/*
 * 날짜:2023/6/19
 * 이름:최동일
 * 내용:성적관리 프로그램 짜기
 */

public class Project1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("이름: ");
		String name=sc.next();
		
		System.out.print("국어점수: ");
		int korean=sc.nextInt();
		
		System.out.print("영어점수: ");
		int english=sc.nextInt();
		
		System.out.print("수학점수: ");
		int math=sc.nextInt();
		
		
		System.out.println(name);
		System.out.println(korean);
		System.out.println(english);
		System.out.println(math);
	}
}
