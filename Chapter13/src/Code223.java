import java.io.FileOutputStream;
import java.io.IOException;

/*
 *날짜: 2023/6/16	 
 *이름: 최동일  	
 *내용: fileoutputstream을 이용하여 파일 출력
 */
public class Code223 {
	public static void main(String[] args) {
		String content= "Hello JAVA Programmers";
		byte[]bytes = content.getBytes();//문자열을 바이트로 반환함
		FileOutputStream fos= null;
		try {
			
			fos= new FileOutputStream("data4.txt");
			fos.write(bytes);
		}catch(IOException e) {
			System.out.println(e);
		}finally {
			try {fos.close();
				
			}catch(IOException e) {
				System.out.println(e);
			}
		}
	}
}
