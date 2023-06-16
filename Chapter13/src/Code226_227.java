import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

//import java.io.BufferedInputStream;
//import java.io.FileInputStream;
//import java.io.IOException;

/*
 *날짜: 2023/6/16	 
 *이름: 최동일  	
 *내용: bufferreader를 이용하여 한글 깨짐 방지
 */
public class Code226_227 {
	public static void main(String[] args) {
//		BufferedInputStream bis= null;
//		try {
//			bis= new BufferedInputStream(new FileInputStream("data6.txt"));
//			int x= 0;
//			while((x=bis.read())!=-1) {
//				System.out.print((char)x);
//			}
//		}catch(IOException e) {
//			e.printStackTrace();
//		}finally {
//			try {
//				bis.close();
//			}catch(IOException e) {
//				System.out.println(e);
//			}
//		}
//위와 같이 입력하면 한글이 깨진다.		
		BufferedReader reader= null;
		try {
			reader =new BufferedReader(new InputStreamReader(new FileInputStream("data6.txt")));
			int x=0;
			while((x=reader.read())!=-1){
				System.out.print((char)x);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				reader.close();
			}catch(IOException e) {
				System.out.print(e);
			}
		}
	}
}
