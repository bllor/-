package example;

public class ex_code70_71 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]d= {{1,2,3,4,},{11,12,13,14},{21,22,23,24}};
		for(int a=0; a<3; a++) {//금방은 if문으로 해서 안됨..
			for(int b=0; b<4; b++) {
				System.out.print(d[a][b]+" ");
			}
			System.out.println();
		}
		for(int c=0; c<d.length; c++) {
			for(int f=0; f<d[c].length;f++) {
				System.out.print(d[c][f]+" ");
			}
			System.out.println();
		}
		System.out.println(d[1][2]);
		
	}

}
