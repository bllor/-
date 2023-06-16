import java.io.FileInputStream;
import java.io.IOException;

/*
 * 날짜: 2023/6/16
 * 이름: 최동일
 * 내용: try with resource예제
 * -try문이 끝나면 자동으로 닫기게 하는 방법
 * -close(); 가 없어도 된다.
 */
public class Code215 {
	
	public static void main(String[] args) {
		int i;
		try(FileInputStream fin= new FileInputStream("data1.txt");){
			do {
				
				i=fin.read();
					if(i!=-1) {
					System.out.print((char)i);
						}
				}while(i!=-1);
		}catch(IOException e) {
			System.out.println("error reading file");
		}
	}
}
