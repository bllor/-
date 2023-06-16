import java.io.FileReader;
import java.io.IOException;

public class Code219_220 {
	/*
	 *날짜: 2023/6/16
	 *이름: 최동일  	
	 *내용: filereader 클래스를 이용한 파일 입력
	 */
	public static void main(String[] args) {
//		FileReader fis= null;
//		try {
//			fis= new FileReader("data1.txt");
//			int x;
//			while((x=fis.read())!=-1) {
//			System.out.print((char)x);}
//		}catch(IOException e) {
//			System.out.println(e);
//		}finally {
//			try {
//				fis.close();
//			}catch(IOException e) {
//				System.out.println(e);
//			}
//		}
		FileReader fis= null;
		char data[] = new char[50];
		try {
				fis= new FileReader("data2.txt");
				fis.read(data);
				for(int x: data) {
					System.out.print((char)x);
				}
		}catch(IOException e) {
			System.out.println(e);
		}finally {
			try {
				fis.close();
			}catch(IOException e) {
				System.out.println(e);
			}
		}
	}
}
