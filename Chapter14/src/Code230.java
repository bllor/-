/*
 * 날짜:2023/6/17
 * 이름:최동일
 * 내용:제네릭 타입을 두 개 사용한 예제
 */

class twoge<T,V>{
	T data1;
	V data2;
	twoge(T d1, V d2){
		data1= d1;
		data2= d2;
	}
	void show() {
		System.out.println("type of T :"+ data1.getClass().getName());
		System.out.println("type of v :"+ data2.getClass().getName());
	}
	T getData1(){return data1;}
	V getData2(){return data2;}
	
}
public class Code230 {
	public static void main(String[] args) {
		twoge<Integer,String> x = new twoge<Integer,String>(100,"hello");
		x.show();
		int y= x.getData1();
		String z= x.getData2();
		System.out.println(y);
		System.out.println(z);
	}
}
