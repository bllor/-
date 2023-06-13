package example;
import java.util.*;
interface Limit{
	int MAX=100;
	int MIN=0;
}
public class ExC167 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("정수를 입력하시오");
		int x= s.nextInt();
		if(x<Limit.MIN||x>Limit.MAX) {
			System.out.println("Out Of Range");}
			else{
				System.out.println("입력값은"+x);
				}
			
		s.close();
	}

}

