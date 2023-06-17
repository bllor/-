import java.util.Comparator;
import java.util.TreeSet;

/*
 * 날짜:2023/6/17
 * 이름:최동일
 * 내용:TreeSet을 이용한 객체들의 비교(2)(comparator 인터페이스)
 */
class p1 {
	private int id;
	private int score;
	
	p1(){}
	
	p1(int id, int score){
		this.id= id;
		this.score= score;}
	
	int getId() {return id;}
	
	public String toString() {
		return "[id="+id+", score="+score+"]";
	}
}
class pcom implements Comparator<p1>{
	public int compare (p1 o1, p1 o2) {
		return o1.getId()-o2.getId();
	}
}
public class Code245 {
	public static void main(String[] args) {
		TreeSet<p1> ts= new TreeSet<>(new pcom());
		ts.add(new p1(3,83));
		ts.add(new p1(5,90));
		ts.add(new p1(1,33));
		ts.add(new p1(2,73));
		ts.add(new p1(4,63));
		ts.add(new p1(6,53));
		for(p1 f:ts) {
			System.out.println(f);
		}
	}
}
