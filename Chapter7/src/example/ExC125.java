package example;
import java.util.Arrays;
class Student33{
	private String name;
	private int score;
	Student33(String name, int score){
		this.name=name;
		this.score=score;
	}
	String getName(){
		return name;
	}
	int getScore() {
		return score;
	}
	void setName(String name) {
		this.name=name;
	}
	void setScore(int score) {
		this.score=score;
	}
	void print() {
		System.out.println(name+"("+score+")");
	}
}
public class ExC125 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student33 st[]= new Student33[5];
		st[0]=new Student33("a",88);
		st[1]=new Student33("b",98);
		st[2]=new Student33("c",80);
		st[3]=new Student33("d",79);
		st[4]=new Student33("e",91);
		int total=0;
		for(int i=0;i<st.length;i++) {
			total+=st[i].getScore();
		}
		double average= (double)total/st.length;
		System.out.println(average);
		//System.out.println(Arrays.toString(st));
		System.out.print(st);
	}

}
