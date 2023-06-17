import java.util.HashSet;

/*
 * 날짜:2023/6/17
 * 이름:최동일
 * 내용:Hashset 실습
 */
/*
 * Hashset은 객체가 동일한지 확인하고 출력하지 않는다.
 */
class pe{
	String name;
	int age;
	pe(String name, int age){
		this.name=name;
		this.age=age;
		
	}
	public String toString() {
		return name+" : "+age;
	}
}
public class Code246_247 {
	public static void main(String[] args) {
		
		Integer[] a= {11,22,33,44,22,33};
		HashSet<Integer>set = new HashSet<Integer>();
		
		for(int i=0;i<a.length;i++) {
			set.add(a[i]);
					}
		System.out.println(set);
		
		System.out.println("---------------------");
	
	
		HashSet<Object>set2= new HashSet<Object>();
		set2.add(new String("Alice"));
		set2.add(new String("Alice"));
		set2.add(new pe("clice",10));
		set2.add(new pe("clice",10));
		System.out.println(set2);
		//clice,10 객체는 같은 값인데도 2개를 저장하였다.
		//이 경우 pe에 동일한 객체임을 판단할 수 있는 코드를 추가하여야 한다.
		
	
	}
	
}
