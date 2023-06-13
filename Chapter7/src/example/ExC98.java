package example;
class friends
{
	String name;
	int age;
	void printfriends(){
		System.out.println("name: "+name+" age: "+age);
	}
}
public class ExC98 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		friends f=  new friends();
		f.printfriends();//현재 f에는 아무런 값이 입력 되어있지 않으므로 default값이 출력된다.
		friends s= new friends();
		s.name="동일";
		s.age=26;
		s.printfriends();
	
	}

}
