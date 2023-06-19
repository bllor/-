package java_miniProject;



/*
 * 날짜:2023/6/19
 * 이름:최동일
 * 내용:성적관리 프로그램 짜기
 */
class Grade{
	private String name;
	private double korean;
	private double english;
	private double math;
	
	Grade(String name,double korean,double english,double math){
		this.name=name;
		this.korean=korean;
		this.english=english;
		this.math=math;
		double average=(korean+english+math)/3;
		
		System.out.printf("%s의 평균점수는 %.2f\n",name,average);
	}
}
public class Project1 {
	public static void main(String[] args) {
		Grade student1= new Grade("강백호",90.0,85.5,70.0);
		Grade student2= new Grade("채치수",82.0,92.0,60.5);
	}
}
