package Test;
import java.util.Arrays;
public class C88 {
	public static int[] makeArray(int size)
	{
		int A[]=new int[size];
		for(int i=0;i<size;i++) {
			 A[i]=i*i;
		}
		return A;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size=6;
		int[]b=makeArray(size);
		System.out.println(Arrays.toString(b));
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
	}

}
