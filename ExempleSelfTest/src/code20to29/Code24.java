package code20to29;

public class Code24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, a, b ;
		n=20;
		a=(33*60);
		b=(5*60*60);
		System.out.println("총 시간은 "+(n+a+b)+"초이다.");
		System.out.println(a);
		System.out.println(b);
		System.out.println(n);
		
		
		int m, x, y, z;
		m= 20000;
		x= m/(60*60);
		m= 20000%(60*60);
		y= m/60;
		m= m%60;
		z=m;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println("총시간은"+x+"시간"+y+"분"+z+"초이다");
		
	}

}
