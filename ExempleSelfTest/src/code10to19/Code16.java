package code10to19;

public class Code16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1000, b=200000, c=10000 ;
		long d=10230;
		System.out.println(a*b*c);
		System.out.println((long)(a*b*c));
//		System.out.println((long)(a*b*c));에서
//		(a*b*c)은 int의 범위를 초과하여 이상한 값으로 입력이 되어서
//		long을 붙인다고 해서 달라지지 않음
		System.out.println((long)a*b*c);
		System.out.println(a*b*d);
		
		/*long s=120310230148;를 하면 오류가 남.
		long s=120310230148l;처럼 뒤에 long을 붙여줘야 long으로 인식하여 오류가 나지 않음
		*/
		long s=120310230148l;
		//long x=L120310230148; 앞에 L을 붙이면 오류가 난다.
		
		System.out.println(s);
	}

}
