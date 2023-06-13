package section4;

public class C61 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a=0;
//		while(a<7) {
//			a++;
//			System.out.println(a);
//			if(a%2==0)continue;
//			System.out.println("***after continue"+a);
//		}
		int i;
		for(i=1;i<=7;i++) {
			System.out.println(i);
			if(i%2==0)continue;
			System.out.println("**"+i);
		}
	}

}
