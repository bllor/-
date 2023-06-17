/*
 * 날짜:2023/6/17
 * 이름:최동일
 * 내용:와일드카드 인수
 */
/*
 * 와일드 카드는 ? 로 나타낸다
 * 와일드 카드 자리에는 어떤 클래스 타입도 올 수 있다.
 */
class WithWild<T extends Number>{
	T data;
	WithWild(T d){data=d;}
	boolean same(WithWild<?>x) {
		if(Math.abs(data.doubleValue())==Math.abs(x.data.doubleValue())) {
			return true;
		}else {
			return false;
		}
	}
}


public class Code231_232 {
	public static void main(String[] args) {
		WithWild<Integer> a=new WithWild<Integer>(6);
		WithWild<Double> b=new WithWild<Double>(-6.0);
		WithWild<Long> c= new WithWild<Long>(5L);
		
		if(a.same(b)) {
			System.out.println("a and b are equal");;
		}else {
			System.out.println("a and b are different");
		}
		if(a.same(c)) {
			System.out.println("a and c are equal");;
		}else {
			System.out.println("a and c are different");
		}
	}
}
/*
 * 작동순서
 * 1.WithWild<Integer> a=new WithWild<Integer>(6)
 * 2.int data;
 * 3.WithWild(int d){data=d;}
 * 4.data=6;
 * 5.WithWild<Double> b=new WithWild<Double>(-6.0);
 * 6.double data;
 * 7.WithWild(double -6){data=-6.0;}
 * 8.data=-6.0;
 * 9.if(a.same(b)
 * 10.boolean same(WithWild<?>x) 
 * > ?에는 Number의 하위클래스가 들어갈 수 있으므로 int, double 둘다 들어갈 수 있다.
 * 11.(Math.abs(data.doubleValue())에는 a의 절대값이 실수형태로 
 * 	  (Math.abs(x.data.doubleValue())에는 b의 절대값이 실수형태로 들어가있어서
 * 	  서로 비교할 수 있다.
 * 
 * 
 * 
 */
