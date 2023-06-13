package example;
import java.util.Arrays;
public class ex_code67 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		int i[]= {5,6,4,3,2,4,21,1};
		int j[]= {1,2,3,4,5,6,7,8,9};
		System.arraycopy(i,2,j,4,3);
		//i의 2번 째부터 시작해서 3개의 원소를 j의4번째에 복사함
		System.out.println(Arrays.toString(i));
		System.out.println(Arrays.toString(j));
		//복사하는 배열의 길이가 붙여넣기 하는 배열의 길이보다 길 경우 에러가 난다.
		
	}

}
