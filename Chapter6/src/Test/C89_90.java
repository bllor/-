package Test;
//가변변수 이용, 변환값 int
//value보다 큰 값들의 합을 구하라
public class C89_90 {

	public static int largervalue(int value, int...v)
	{int sum=0;
		for(int i=0;i<v.length;i++) {
			if(v[i]>=value) {
				sum+=v[i];
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int s;
		int s= largervalue(10,5,3,11,17,2,20,15);
		System.out.println("sum= "+s);
	}

}
