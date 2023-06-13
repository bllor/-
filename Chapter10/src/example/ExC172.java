package example;
interface Withdefault{
	int count =100;
	void test();
	default void show() {
		System.out.println("show");
	}
	static int result() {
		return 100;
	}
}
class Test implements Withdefault{
	public void test() {
		System.out.println("test");
	}
}
public class ExC172 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t= new Test();
		t.test();
		t.show();
		System.out.println(Withdefault.result());
	}

}
