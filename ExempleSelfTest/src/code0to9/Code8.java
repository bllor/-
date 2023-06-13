package code0to9;

public class Code8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=33, b=25;
		System.out.println(a+"Hello");
		System.out.println(a+"Hello"+b);
		System.out.println((a+b)+"Hello");
		System.out.println((a+b)+"Hello"+a+b);
		System.out.println(a+b+"Hello"+a+b);
		/*System.out.println(a+b+"Hello"+a+b);을 출력하면 58Hello3325이 나오는데
		 ""앞의 a+b는 숫자로 인식하고, 뒤의 a+b는 문자로 인식하여 나열함
				*/
		System.out.println((a+b)+"Hello"+(a+b));
		
	}

}
