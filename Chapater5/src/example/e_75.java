package example;

public class e_75 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] n= {{1,2,3},{4,5,6},{7,8,9}};
		for(int[] x: n){//배열x에 n을 넣는다는 말
			for(int y: x)//y에 배열x를 넣는다는 말
				System.out.print(y+" ");//배열에 맞게 들어올 때까지 출력됨.
			System.out.println();
		}
	}

}
