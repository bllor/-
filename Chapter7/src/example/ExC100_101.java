package example;
class Friend{
	String name;
	int age;
	Friend(){}
	Friend(String n, int a){	
	name=n;
	age=a;
	}
	void printFriend() {
		System.out.println("name: "+name+"age: "+age);
	}
}
public class ExC100_101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Friend f= new Friend();
		Friend s= new Friend();
		s.name="동일";
		s.age=26;
		Friend q= new Friend("희지", 25);
		f.printFriend();
		s.printFriend();
		q.printFriend();
	}

}
