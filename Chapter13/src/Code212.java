import java.io.FileInputStream;
import java.io.IOException;

public class Code212 {

	public static void main(String[] args) {
		
		FileInputStream fis= null;
		try {
			fis= new FileInputStream("data1.txt");
			int x;
			while((x=fis.read())!=-1)//읽어드릴 문자가 없을 때 -1이 찍힌다.
					System.out.print((char)x);
		}catch(IOException e){
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
