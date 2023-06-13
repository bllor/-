package example;

public class Ex_Student extends Ex_Person {
	private int year;
	Ex_Student(){}
	Ex_Student(int no, String name, int year){
		super(no,name);
		this.year=year;
	}
	void show() {
		System.out.println("Student Information");
		System.out.println("-------------------");
		System.out.println("number: "+getNo());
		System.out.println("name: "+getName());
		System.out.println("year:"+year);
	}
}
