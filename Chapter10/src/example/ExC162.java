package example;
class Parent{
	public void show() {
		System.out.println("parent show");
	}
	public void print() {
		System.out.println("parent print");
	}
}
public class ExC162 extends Child1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent x= new Child1();
		Parent y= new Child1();
		x.print();//print가 오버라이드 되었으므로 Child1의 매서드가 출력된다.
		x.show();//오버라이드 되지 않으므로 Parent의 것이 출력된다.
		
	}

}
