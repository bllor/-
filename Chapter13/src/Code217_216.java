import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Code217_216 {
/*
 *날짜: 2023/6/16
 *이름: 최동일  	
 *내용: 배열을 이용하여 파일의 데이터 읽어오기
 */
	  	
	public static void main(String[] args) {
		
//		FileInputStream fis = null;
//		
//		byte b[]= new byte[50];
//		
//		try {
//			fis= new FileInputStream("data1.txt");
//			fis.read(b);//파일 내용을 모두 배열 b로 읽어 드립니다.read()가 되면 파일 안읽힘
//			for(byte x:b) {
//				System.out.print((char)x);
//			}
//			}catch(FileNotFoundException e){
//				System.out.println("data1.txt는 없는 파일입니다.");
//		}catch(IOException e) {
//			System.out.println(e);
//		}finally {
//			try {
//				fis.close();
//			}catch(IOException e) {
//				System.out.println(e);
//			}catch(NullPointerException e) {
//				System.out.println("fis가 null값을 가지고 있습니다.");
//			}
//		}
		
/*		try with resource로 해보기*/
		byte []b= new byte[50] ;
		try(FileInputStream fin= new FileInputStream("data1.txt");){
			
				 fin.read(b);
				 for(byte x: b)
					 System.out.print((char)x);
			
		}catch(IOException e) {
			System.out.println(e);
		}
		
	}
}
