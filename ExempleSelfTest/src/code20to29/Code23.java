package code20to29;

public class Code23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=2753, b, c, d, e;
		b=a/1000 ;
		c=a%1000/100;
		d=a%1000%100/10;
		e=a%1000%100%10;
		System.out.println("1000의 자리: "+b);
		System.out.println("100의 자리: "+c);
		System.out.println("10의 자리: "+d);
		System.out.println("1의 자리: "+e);
		/*책에서는 int n=2753;
		int a, b, c, d;
		a=n/1000;
		n=n%1000;
		b=n/100;
		n=n%100;
		c=n/10;
		d=n%10;
		System.out.println("1000의 자리: "+a);
		System.out.println("100의 자리: "+b);
		System.out.println("10의 자리: "+c);
		System.out.println("1의 자리: "+d);
		로 나타냈는데 이게 좀 더 직관적인 것 같음*/
		
	
	}

}
