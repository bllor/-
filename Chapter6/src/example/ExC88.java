package example;

public class ExC88 {
	public static int[] makeArray(int size)
	{
		int i[]=new int[size];
		for(int a=0;a<size;a++) {
			i[a]=a*a;}
			return i;
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s=5;
		int B[]=makeArray(s);
		for(int i=0;i<B.length;i++)
			System.out.println(B[i]);
	}

}
