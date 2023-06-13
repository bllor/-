package example;
interface A{
	void test1();
	void test2();
}

interface B{
	void test3();
	void test4();
}

class S implements A,B{
	public void test1() {
		System.out.println("test1");
	}public void test2() {
		System.out.println("test2");
	}public void test3() {
		System.out.println("test3");
	}public void test4() {
		System.out.println("test4");
	}
	
}

public class ExC171 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		S s=new S();
		s.test1();
		s.test2();
		s.test3();
		s.test4();
		}

}
