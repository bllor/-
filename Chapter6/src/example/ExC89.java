package example;

public class ExC89 {
	public static void var(int...v)
	{
		System.out.println("length is "+v.length);
		//System.out.println("length is "+v);를 하니까 v의 저장공간이 나옴.
		
		for(int a=0;a<v.length;a++) {
			System.out.println(v[a]);//v의 a번째 배열을 출력한다는 뜻
				}
		//매서드에서 출력을 하려고 하면 void를 써야함
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var();
		var(1);
		var(1,3);
		var(3,0,0,7);
	}

}
