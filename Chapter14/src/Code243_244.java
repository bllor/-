
import java.util.Iterator;
import java.util.TreeSet;

/*
 * 날짜:2023/6/17
 * 이름:최동일
 * 내용:TreeSet을 이용한 객체들의 비교(comparable인터페이스)
 */
/*
 * Code 242처럼 하나의 Integer객체들은 숫자의 비교가 가능하지만 두 수가 입력되면 비교할 수 없다.
 * 이럴 때는 따로 인터페이스를 추가해주어야 한다.
 * 먼저comparable인터페이스를 추가하여 진행한다.
 */
class p implements Comparable<p>{
	private int id;
	private int score;
	p(){}
	p(int id, int score){
		this.id= id;
		this.score= score;}
	
	public String toString() {
		return "[id="+id+", score="+score+"]";
	}
	//1.comparable인터페이스 사용.
	public int compareTo(p e) {
		return this.score-e.score;
		//score를 비교하여 오름차순으로 정리
		//(3,83)과(5,90)을 비교하여 score에서 83이 더 낮으므로 앞으로 출력된다.
	}
}

public class Code243_244 {
	public static void main(String[] args) {
		TreeSet<p> ts= new TreeSet<>();
		ts.add(new p(3,83));
		ts.add(new p(5,90));
		ts.add(new p(1,33));
		ts.add(new p(2,73));
		ts.add(new p(4,63));
		ts.add(new p(6,53));
		
		Iterator<p> it= ts.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	
	}
}
