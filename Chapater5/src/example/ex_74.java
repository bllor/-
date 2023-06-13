package example;

public class ex_74 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a[]= {'A','B','C','D','E'};
		for(char x:a) {
			System.out.println(x+":"+(char)(x+32));
		}
		char b='A';
		System.out.println(b+":"+(char)(b+32));
		//(A+32)를 하게 되면 a가 된다.
	}

}
