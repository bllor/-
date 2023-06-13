package example;
abstract class Parent1{//class abstract로 쓰면 안됨.
	 void show() {
		System.out.println("Parent1 show");
	}
	abstract void print();
}

class Child2 extends Parent1{
	void print() {
		System.out.println("Child2 print");
	}
	void call() {
		System.out.println("Child2 call");
	}
}
public class ExC162_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent1 x= new Child2();
		Parent1 y= new Child2();
		x.show();
		x.print();
		//x.call(); 오버라이드 되지 않으면 출력되지 않는다.
	}

}
