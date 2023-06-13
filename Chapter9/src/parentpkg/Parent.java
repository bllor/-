package parentpkg;

public class Parent {
	private int id;
	public Parent(int id) {
		this.id=id;
	}
	
	public int getId() {return id;}
	public void show() {
		System.out.println("id: "+id);
	}
		
	
}
//public을 지우고 default나 다른 인자들로 바꾸면 ExC159에서 클래스를 사용할 수 없음
//그럴 때는 protected를 사용하면 자식인 클래스에서 부모클래스를 사용가능함.

