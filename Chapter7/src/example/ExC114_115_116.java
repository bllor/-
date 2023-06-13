package example;
class Circle{
	static double PI=3.141592;
	double radius;
	Circle(double radius){
		this.radius=radius;
	}
	double area() {
		return this.radius*this.radius*PI;
	}
	double perimeter() {
		return 2*PI*this.radius;
	}
	static void printPI() {
	System.out.println("PI:"+PI);
	}
}
public class ExC114_115_116 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1= new Circle(10.0);
		Circle c2= new Circle(100.0);
		System.out.println(c1.area());
		System.out.println(c2.area());
		Circle.printPI();//static 메서드 안으로 부르려면 static문장이 되어야하고
		//클래스명.메서드명으로 불러야함.
	}
	
}
