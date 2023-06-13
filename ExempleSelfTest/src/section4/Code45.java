package section4;

public class Code45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=94;
		if (n>=90) {
			if(n>=95) {
			System.out.println("Excellent");}
			else {
				System.out.println("good");
			}
		}//if조건이 끝난다음{}표시를 지나서 else if(조건2)를 설정
		else if(n>=80){
			System.out.println("SoSo");
		}
		else {
			System.out.println("terrible");
		}
		System.out.println("Good Bye");
		//모든 끝나는 문장에 프린트됨 if절 밖에 있으니까
		
	}
}
