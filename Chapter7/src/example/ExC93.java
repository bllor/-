package example;
class car{
	String kind;
	String color;
	int year;
	
//	void carprint() {
//		System.out.println("kind is "+kind);
//		System.out.println("color is "+color);
//		System.out.println("year is "+ year);
//	} 출력을 하려면 위와 같이 입력을 하면 된다.
		void run() {
		System.out.println("GO.");
	}
	void speedup() {
		System.out.println("Power UP");
	}
}
public class ExC93 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car mycar=new car();//car mycar를 하는 이유는car클래스를 쓴다는 것 같음
		mycar.kind="porsche";//문자열 입력시 ""필수
		mycar.color="red";
		mycar.year=2023;
		System.out.println(mycar);//mycar코드가 저장된 위치가 출력됨.
		mycar.run();
		//mycar.carprint();
		
	}

}
