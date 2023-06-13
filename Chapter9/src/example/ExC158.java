package example;

public class ExC158 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		book bk= new bk(101,"java",20000);
//		으로 치면 book을 찾을 수 없어서 에러가 나온다.
//		실행방법1: book 앞에 패키지 명까지 붙여주기
//		실행방법2: import 패키지명.클래스명;으로 적기
		bookpkg.book bk=new bookpkg.book(101,"java",20000);
		bk.printBookInfo();
	}
	

}
