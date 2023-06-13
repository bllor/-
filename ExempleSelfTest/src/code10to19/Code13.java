package code10to19;

public class Code13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b = 126, c;
		System.out.println(b);
		System.out.println(++b);//b는 1이 증가되어서 127로 뜸
		c=b;
		System.out.println(c);
		System.out.println(++c);//++C값이 byte의 한계를 넘으므로 한바퀴 돌아서 -128이 됨.
	}

}
