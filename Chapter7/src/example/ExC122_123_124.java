package example;
class Point{
	private int x;
	private int y;
	
	Point(){}
	Point(int x, int y){
		this.x=x;
		this.y=y;
	}
	int getX() {
		return x;
	}
	int getY() {
		return y;
	}
	void setX(int x) {
		this.x=x;
	}
	void setY(int y) {//set의 괄호에는 받는 값이 들어가야함.
		this.y=y;
	}
}
public class ExC122_123_124 {
	static void add(Point t1, Point t2) {
		Point pt= new Point();
		pt.setX(t1.getX()+t2.getX());
		pt.setY(t1.getY()+t2.getY());
		System.out.println("p1+p2="+pt.getX()+" , "+pt.getY());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p1= new Point(3,5);
		Point p2= new Point(5,7);
		System.out.println(p1.getX()+" , "+p1.getY());
		System.out.println(p2.getX()+" , "+p2.getY());
		add(p1,p2);
	}

}
