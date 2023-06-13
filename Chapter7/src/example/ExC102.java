package example;
class Student{
	int no;
	String name;
	double score;
	Student(){}
	Student(int n){
		no=n;
	}
	Student(int n, String a){
		no=n;
		name=a;
	}
	Student(int n, String a, double b){
		no=n; name=a; score=b;
	}
	void printStudent() {
		System.out.println("no: "+no+"name: "+name+"score: "+score);
	}
}
public class ExC102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student q=new Student();
		Student w=new Student(10);
		Student e=new Student(10,"hi");
		Student r=new Student(20,"good",85.3);
		
		q.printStudent();
		w.printStudent();
		e.printStudent();
		r.printStudent();
		
	}

}
