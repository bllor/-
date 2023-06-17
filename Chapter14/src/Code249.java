import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * 날짜:2023/6/17
 * 이름:최동일
 * 내용:HashMap
 */
/*
 * 1.HashMap
 * <키,값>의 쌍으로 데이터가 구성되고 키를 기준으로 정렬이 이루어진다.
 * 키 값은 중복되면 안되지만 데이터는 중복되어도 괜찮다.
 */
public class Code249 {
	public static void main(String[] args) {
		HashMap<String, String>map= new HashMap<>();
		map.put("a", "1");
		map.put("b", "2");
		map.put("c", "3");
		map.put("d", "4");
		map.put("e", "1");
		Set<String> keySet=map.keySet();
		System.out.println(keySet);//key만 뽑아냄
		System.out.println("-------------");
		
		
		for(Map.Entry<String, String> e: map.entrySet()) {
			String key = e.getKey();
			String value= e.getValue();
			System.out.println(key+" : "+value );
		}
		System.out.println("-------------");
		String val= (String)map.get("a");
		System.out.println(val);
		
		
		
	}
}
