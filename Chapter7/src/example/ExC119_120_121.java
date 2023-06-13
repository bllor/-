package example;
class book2{
	private String title;
	private int price;
	//private로 정해진 값은 다른 클래스에서 접근할 수 없으므로 접근자와 변경자가 필요하다.
	book2(){}
	book2(String title, int price){
		this.title=title;
		this.price=price;
	}
	String getTitle() {//접근자
		return title;
	}
	int getPrice() {
		return price;
	}
	void setTitle(String title) {//변경자
		this.title=title;
	}
	void setPrice(int price) {
		this.price=price;
	}//변경자의 값은 this로 하여서 바뀌게끔 만들어야 한다.
	void printBook() {
		System.out.println("title: "+title);
		System.out.println("price: "+price);
	}
}	
public class ExC119_120_121 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		book2 b2= new book2("책",20000);
		b2.printBook();
		b2.setPrice(19000);
		b2.setTitle("북");
		System.out.println("title: "+b2.getTitle()+" price: "+b2.getPrice());
		
	}

}
