import java.util.HashSet;

/*
 * 날짜:2023/6/17
 * 이름:최동일
 * 내용:Hashset 에러 솔루션
 */
class pe2{
	String name;
	int age;
	pe2(String name, int age){
		this.name=name;
		this.age=age;
		
	}
	public String toString() {
		return name+" : "+age;
	}
//이 매서드들을 추가해서 에러를 잡을 수 있다.	
	public boolean equals(Object obj){
		if(obj instanceof pe2) {
				pe2 tmp=(pe2)obj;
				return name.equals(tmp.name)&&age==tmp.age;
		}
		return false;
	}
	public int hashCode() {
		return name.hashCode()+age;
	}
}

public class Code248 {
	public static void main(String[] args) {
		HashSet<Object>set2= new HashSet<Object>();
		set2.add(new String("Alice"));
		set2.add(new String("Alice"));
		set2.add(new pe2("clice",10));
		set2.add(new pe2("clice",10));
		System.out.println(set2);
		
	}
}
