package example;
import java.util.Arrays;

public class ex_code64_65 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]score= {90,85,70,65,55};
		double[]s={3.432,325.324,1324.32412,.3124,34123};
		//배열에 저장된 내용 출력

		for(int a=0; a<score.length; a++){//for뒤에 ;오면 안됨
			System.out.println("score["+a+"]="+score[a]);
		}//하나씩 출력하기
		System.out.println(Arrays.toString(s));
		//한번에 출력하는데 package이름 밑에 import java.util.Arrays가 있어야 가능
	
	}

}
