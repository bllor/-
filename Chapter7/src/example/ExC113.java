package example;
class student3{
	int number;
	String name;
	double score;
	student3(){}
	student3(int number){
		this.number=number;
	}
	student3(int number,String name){
		this(number);//		this.number=number;와 같은 뜻
		this.name=name;
	}
	student3(int number,String name, double score){
		this(number,name);
		//this(score); <-- 다른 곳에서 쓰이지 않으면 이 형식으로 가져올 수 없다.
		this.score=score;
	}
	void hello() {
		System.out.println("Hello");
	}
	void printstudent3() {
		this.hello();//같은 클래스 내의 메소드를 가져옴.
		System.out.println(number+" "+name+" "+score);
	}
}
public class ExC113 {
//	  void hello() {
//		System.out.println("Hello");
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student3 q=new student3();
		student3 w=new student3(10);
		student3 e=new student3(20,"ei");
		student3 r=new student3(30,"qi",40.4);
		q.printstudent3();
		w.printstudent3();
		e.printstudent3();
		r.printstudent3();
		//this.hello(); <-- static이 아니라서 못가져오는 듯..
		//this.printstudent3();this는 같은 클래스에 있는 매소드만 호출가능
	}	//현재는 다른 클래스라서 안됨.

}
