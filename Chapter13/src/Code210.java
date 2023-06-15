import java.io.IOException;

public class Code210 {

	public static void main(String[] args) {
		int x;
		try {
			while((x=System.in.read())!=-1) {
				System.out.print((char)x);
			}//값을 입력하게 되면 입력한 값이 나온다.
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
