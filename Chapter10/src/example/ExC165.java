package example;

public class ExC165 {

	public static void main(String[] args) {
		Ex_Person t1= new Ex_Teacher(112,"a","b");
		Ex_Person t2= new Ex_Teacher(114,"C","D");
		Ex_Person s1= new Ex_Student(122,"a",20);
		Ex_Person s2= new Ex_Student(118,"a",22);
		t1.show();
		t2.show();
		s1.show();
		s2.show();
	}
}
