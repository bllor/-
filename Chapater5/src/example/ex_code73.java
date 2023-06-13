package example;

public class ex_code73 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[]score= {90.5,88.3,70.8,67.2,92.4,80.7};
		double total=0;
		double average;
		
		for(double s: score) {
			total+=s;}// total에서 괄호가 닫히게 만들어야함 그래야 합쳐지고 계산이 이상하게 안됨.
			average= total/score.length;
			System.out.println("average is "+average);
		
	}

}
