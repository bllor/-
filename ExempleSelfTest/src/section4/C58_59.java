package section4;

public class C58_59 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1, b=1;
		while(a<=10) {
			if(a==5) {
				break;
			}
			System.out.println(a+": Hello World");
		a++;
		}// 위에 구문은 a가 5가되면 멈추므로 1234까지 밖에 출력이 안됨.
	
		while(b<=5) {
			if(b==10) {
				break;
			
			}
			System.out.println(b+": Hello World");
			b++;
		}
	}

}
