import java.io.IOException;

public class Code209 {

	public static void main(String[] args) {
		System.out.print("Enter one character : ");
		int x;
		try {
			x = System.in.read();//read가 있으므로 scanner가 없어도 문자를 입력 받을 수 있다.
			System.out.println("you entered "+ x);
			//read는 int형이므로 x에 a가 들어가면 a의 유니코드숫자가 출력된다.
			System.out.println("you entered "+ ((char)x));
		}
		catch(IOException e) {//입력받는 문장에서는 catch문이 반드시 필요하다.
			e.printStackTrace();
		}
	}
}
