import java.io.FileInputStream;
import java.io.IOException;

//입력할 파일이 존재하지 않을 때 뜨는 에러를 막기 위한 예외처리
public class Code213_214 {
	
	public static void main(String[] args) {
		FileInputStream fis=null;
		
		try {
			fis = new FileInputStream("input.txt");
			System.out.print((char)fis.read());
		}catch(IOException e) {
			System.out.println(e);
		}finally {
			
			try {
				fis.close();
			}catch(NullPointerException e) {
				System.out.println("fis가 null값을 가지고 있습니다.");
			}catch(IOException e){
				System.out.println(e);
			}
		}
	}
}
//파일이 없을 때 나타나는 것을 예외처리하기 위한 메서드
//IOException이 상위예외클래스지만 NullPointerException과는 관계가 없으므로
//순서를 바꿔도 상관없다.