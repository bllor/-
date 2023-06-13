package section4;

public class C60 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int b=1;
//		while(b<=4) {
//			b++;
//			System.out.println(b);//A
//			b++;
//		if(b%3==0)continue;{
//			System.out.println(b);//B
//		}
//			b++;
//			}
		// if의 조건이 만족되면 B는 실행되지 않고 A가 다시 실행된다.
		//위의 식에서 잘못되었던 것은 A++;가 IF밑에 있어서 안되었던 것 같음
		//b++이 if 위에 있다고 해도 출력이 2개가 있어서 22 3 44 55이런 식으로 됨
		//그래도 처음3만 출력되고 b%3==0일때는 출력안됨
		
		int a=0;
		while(a<10) {
			a++;	// A
			if(a%3==0)continue;
			System.out.println(a); //B
			//if의 조건에 맞으면 B가 실행되지 않고 A가 실행된다.
		}
	}
		//System.out.println(b%3);=0출력
}


