import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*
 * 날짜:2023/6/17
 * 이름:최동일
 * 내용:TreeMap
 */
class pe3{
	private String name;
	private int age;
	
	pe3(String name, int age){
		this.name=name;
		this.age=age;
		
	}
	public String toString() {
		return name+" : "+age;
	}
}
public class Code250 {
	public static void main(String[] args) {
		TreeMap<Integer, pe3> map= new TreeMap<>();
		map.put(3,new pe3("a",10));
		map.put(2,new pe3("f",20));
		map.put(5,new pe3("e",40));
		map.put(4,new pe3("d",30));
		map.put(1,new pe3("c",60));
		map.put(6,new pe3("b",50));
		
		Set<Integer>keySet= map.keySet();
		System.out.println(keySet);
		System.out.println("-----------------");
		
		for(Map.Entry<Integer, pe3> e: map.entrySet()) {
			Integer key= e.getKey();
			pe3 value= e.getValue();
			System.out.println(key+":"+value);
		}
			System.out.println("--------------");
			pe3 val= (pe3)map.get(3);
			System.out.print("key 3 ->");
			System.out.println(val);
	
	
	
	}
}