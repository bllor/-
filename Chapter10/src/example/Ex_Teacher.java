package example;

public class Ex_Teacher extends Ex_Person {
	private String subject;
	
	Ex_Teacher(){}
	Ex_Teacher(int no, String name, String subject){
		super(no,name);
		this.subject=subject;
	}
	void show() {
		System.out.println("Teacher Information");
		System.out.println("-------------------");
		System.out.println("number: "+getNo());
		System.out.println("name: "+getName());
		System.out.println("subject:"+subject);
	}
}
