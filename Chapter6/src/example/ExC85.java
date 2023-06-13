package example;

import java.util.Scanner;

public class ExC85 {
	public static int add(int a, int b)
	{
		int result;
		result= a+b;
		return result;
	}
	public static int findMax(int a, int b)
	{
		//String x;
		if(a>b){//if(a>b);가 되면 else를 사용할 수 없으므로 else를 사용하려면 ;를 지워야 한다.
			return a;
			}
//		else if(a==b){		
//			return  x=("a와 b가 같다");}//System.out.println("두 수가 같다");}
		else {
			return b;
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter n:");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=add(a,b);
		int d=findMax(a,b);
		System.out.println("a:"+a+"b:"+b+"c:"+c+"d:"+d);
		s.close();
		
		
	}

}
