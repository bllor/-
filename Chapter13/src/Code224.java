import java.io.FileWriter;
import java.io.IOException;

/*
 *날짜: 2023/6/16	 
 *이름: 최동일  	
 *내용: filewriter을 이용하여 파일 출력
 */
public class Code224 {
	public static void main(String[] args) {
		
		char[]cbuf= {'j','a','v','a'};
		String lang= "language";
		FileWriter fos= null;
		try {
			fos= new FileWriter("data5.txt");
			fos.write(cbuf);
			fos.write("\n---------------\n");
			fos.write(lang);
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fos.close();
			}catch(IOException e) {
				System.out.println(e);
			}
		}
	}
}
