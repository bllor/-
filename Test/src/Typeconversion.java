
public class Typeconversion {

	public static void main(String[] args) {
		byte b =127;
		int i = 100;
		
		System.out.println(b+i);// byte형이 int형으로 바뀌어서 계산이됨
		System.out.println(10/4);
		System.out.println(10.0/4);
		//10.0이 double이므로 double로 바뀌어 계산이 되어 소수점까지 나옴
		System.out.println((int)2.9+1.8);
		System.out.println((int)(2.9+1.8));//int형으로 바뀌면서 데이터 손실이 일어남
		System.out.println((int)2.9+(int)1.8);
	
	}

}
