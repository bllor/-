package example;

public abstract class Ex_Person {
	private int no;
	private String name;
	
	Ex_Person(){}
	Ex_Person(int no, String name){
		this.no=no;
		this.name=name;
	}
	int getNo(){
		return no;
	}
	String getName() {
		return name;
	}
	abstract void show();
}
