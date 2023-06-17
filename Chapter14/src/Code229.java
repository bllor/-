/*
 * 날짜:2023/6/17
 * 이름:최동일
 * 내용:제네릭스 매소드 예제
 */
/*
 * 1.제네릭스 : 매개변수화된 자료형
 * -제네릭스를 이횽하면 매개변수에 다양한 자료형의 데이터를 넘길 수 있다.
 * -레퍼런스형만 제네릭스로 사용할 수 있다.
 * -wrapper클래스
 * 	boolean - Boolean
 * 	Char - Character
 * 	byte - Byte
 *  short - Short
 *  int - Integer
 *  long - Long
 *  float - Float
 *  double - Double
 */
class data<T>{
	T obj;
	data(T ob){
		obj= ob;
	}
	T getobj() {
		return obj;
	}
	void showType() {
		System.out.println("Type of T: "+obj.getClass().getName());
	}//getClass()만하면 Type of T: class java.lang.Integer이렇게 출력되며
}	 //getName을 붙이면 java.lang.Integer 출력된다. getName()만은 쓸 수 없다.
public class Code229 {
	public static void main(String[] args) {
		data<Integer> d1=new data<Integer>(100);
		System.out.println(d1.getobj());
		d1.showType();
	
		data<String> d2=new data<String>("java");
		System.out.println(d2.getobj());
		d2.showType();
	
	}
}
