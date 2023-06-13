package code30to39;

public class Code38_39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=2000;
		//float a; < 이렇게 하면 형식이 겹쳐서 안됨
		//float b; --> b=a; 이런식으로 하여야 형변환이 됨.
		//System.out.println((float)a);를 했을 때 형변환이 된다.
		float b;
		b=a;
		System.out.println(a);
		System.out.println((float) a);
		System.out.println(b);
		
		char i='a';
		int n=i;
		System.out.println(i);
		System.out.println((double)i);
		System.out.println(n);
		
	}

}
