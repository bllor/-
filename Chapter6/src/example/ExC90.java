package example;

public class ExC90 {
	public static int largerThanValue(int value, int...v)
	{
		int sum=0;
		for(int i=0;i<v.length;i++) {
			if(v[i]>=value) {
				sum+=v[i];
			}
		}
		return sum;
	}
	//return 값을 적지 않아서 this method must return a result of type int
	//라는 오류가 떴음
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int largerSum;
		largerSum= largerThanValue(10,5,3,11,17,2,20,15);
		System.out.println("sum: "+largerSum);
	}

}
