package code40to49;

public class Code42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b1=10, b2,b3 ;
		int i=5;
		
		b2=(byte)(i+ b1) ;
		//(byte)i+bi 으로 하면 i가 int인 상태로 남으므로
		//(byte)(i+ b1)이렇게 해야 byte로 계산이 된다.
		System.out.println(b2);
		b3=(byte)(b2+3);
		//리터털형도 앞에 정의를 해줘어야 변형이 되어서 에러없이 계산이 된다.
		System.out.println(b3);
	
	}

}
