import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Code218 {
/*
 *날짜: 2023/6/16
 *이름: 최동일  	
 *내용: File 클래스를 이용하여 fileinputstream 객체 만들기
 */
	
	public static void main(String[] args) {
		File f= new File("data2.txt");
		FileInputStream fis= null;
		try {
			fis = new FileInputStream(f);
			int x;
			while((x=fis.read())!=-1)
				System.out.print((char)x);
		}catch(IOException e) {
			System.out.println(e);
		}finally {
			try {
				fis.close();
			}catch(IOException e){
				System.out.println(e);
			}
		}
	}
}
