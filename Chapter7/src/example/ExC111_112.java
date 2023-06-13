package example;
class Book{
	String title;
	int price;
	Book(String title, int price){
		this.title=title;//==this(title);로 표현할 수 있으며 ()에는 하나 이상 들어갈 수 있음
		this.price=price;
	}
	void printBook() {
		System.out.println("이름: "+title+", 가격: "+price);
	}
}
public class ExC111_112 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1= new Book("책",200000);
		Book b2= new Book("북",10000);
		b1.printBook();
		b2.printBook();
	}

}
