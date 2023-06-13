package example;
class Data{
	int n;
	//Data(){}
	Data(int x){
		n=x;
	}
	void printData(){
		System.out.println("Data is "+n);
	}
}
public class ExC103_104_105 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Data d= new Data();//default값에 인수가 들어가야 하므로 출력이 안된다.
		Data a= new Data(17);
		//d.printData();
		a.printData();
	}

}
