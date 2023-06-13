package example;//클래스명이 겹쳐서 실행이 안됨.
//default값을 만들어 놓은 경우
class Dogs
{
	String name;
	int age;
	Dogs(){
		System.out.println("Default constructor is called");
	}
	void printdog(){
		System.out.println("name: "+name);
		System.out.println("age: "+age);
	}
}
public class ExC99 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dogs bia=new Dogs();
		//bia.name="bia";
		//bia.age=10;
		//dog miki=new dog();
		bia.printdog();
		//miki.printdog();
	}

}
