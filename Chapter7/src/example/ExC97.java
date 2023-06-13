package example;
class student2{
	int no;
	String name;
	double score;
	void printStudent() {
		System.out.println("no :"+no);
		System.out.println("name :"+name);
		System.out.println("score :"+score);
	}
	void updateScore(double change) {
		score+=change;
	}
}
public class ExC97 {
//	void square(double c) {
//		double score=0;
//		score *=c;
//	}score가 명시 되어있지 않으므로 다른 클래스에서 사용하지 못하는 것 같다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student2 s1=new student2();
		student2 s2=new student2();
		student2 s3=new student2();
		s1.no=1;
		s1.name="동일";
		s1.score=100;
		s2.no=2;
		s2.name="희지";
		s2.score=99;
		s3.no=3;
		s3.name="비아";
		s3.score=100;
		s1.printStudent();
		s2.printStudent();
		s3.printStudent();
		s2.updateScore(77);
		s3.updateScore(1234);
		System.out.println("--------------");
		s1.printStudent();
		s2.printStudent();
		s3.printStudent();
		
	}

}
