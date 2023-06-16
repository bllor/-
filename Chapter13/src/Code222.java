import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/*
	 *날짜: 2023/6/16
	 *이름: 최동일  	
	 *내용: 파일을 읽은 후 객체 배열을 생성
	 */

class student{
	private int no;
	private String name;
	private int score;
	
	student(){}
	student(int no, String name, int score){
		this.no= no;
		this.name= name;
		this.score= score;
		
	}
	int getNo() {return no;}
	String getName() {return name;}
	int getScore() {return score;}
	public String toString() {
		return no+": "+name+" ("+score+")";
	}
}
public class Code222 {
	public static void main(String[] args) {
		student ST[]= new student[5];
		File file= new File("student.txt");
		Scanner scin= null;
		int i=0;
		try {
			scin= new Scanner(file);
			while(scin.hasNext()) {//hasNext는 파일에서 다음데이터를 가져올 때 사용한다.
				int no=scin.nextInt();
				String name= scin.next();
				int score= scin.nextInt();
				ST[i++]=new student(no,name,score);
			}
		}catch(IOException e) {
			System.out.println(e);
		}
		
		System.out.println("====Student list====");
		System.out.println("--------------------");
		for(student s: ST) {
			System.out.println(s);
		}
		scin.close();
	}
	
}
