import java.io.FileInputStream;
import java.io.IOException;

public class Code211 {
	
	public static void main(String[] args) {
		
		FileInputStream fis =null;
		
		try {
				fis =new FileInputStream("data1.txt");//이것을 수행하려면 같은 프로젝트 내에 txt파일이 존재해야 한다.
				System.out.println((char)fis.read());
				System.out.println((char)fis.read());
				System.out.println((char)fis.read());
				System.out.println((char)fis.read());
				System.out.println((char)fis.read());
				System.out.println((char)fis.read());
				System.out.println((char)fis.read());
				System.out.println((char)fis.read());
				System.out.println((char)fis.read());
				System.out.println((char)fis.read());
		}catch(IOException e){
			System.out.println(e);
		}finally {
			try {
				fis.close();
			}catch(IOException e){
				System.out.println(e);
			}
		}
		System.out.println("main end");
	}
}
