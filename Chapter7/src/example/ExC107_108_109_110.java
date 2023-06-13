package example;
class Student1{
	static int numberOfStudent;
	String name;
	double score;
	Student1(){
		numberOfStudent++;
	}
	Student1(String n, double d){
		numberOfStudent++;
		name=n;
		score=d;
	}
	void print() {
		System.out.println("name: "+name);
		System.out.println("score: "+score);
		System.out.println("number of Student: "+numberOfStudent);
	}
}
public class ExC107_108_109_110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s= new Student1();
		s.print();
		Student1 t= new Student1("학생",99.9);
		t.print();// 하나씩 출력하면 number값이 증가
		Student1 e= new Student1("학생2",10.9);
		Student1 r= new Student1("학생3",29.9);
		e.print();//number값이 다 정의 되어 증가된 상태로 출력을 하게 되어서 e,r둘다 4로 출력됨.
		r.print();
		System.out.println(Student1.numberOfStudent);
		//Student1.numberOfStudent를 하면 Student1의 numberOfStudent값을 뽑을 수 있다.
	}

}
