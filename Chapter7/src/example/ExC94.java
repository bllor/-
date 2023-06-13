package example;
class Dog{
	String name;
	int age;
}
public class ExC94 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog happy= new Dog();
		Dog bia= new Dog();
		happy.name="happy";
		happy.age=5;
		bia.name="bia";
		bia.age=11;
		System.out.println("나는 강아지를 두 마리 키웁니다."+
		"한마리의 이름은 "+bia.name+"이고,"+"다른 한 마리의 이름은"+happy.name+"입니다.");
		
		
	}

}
