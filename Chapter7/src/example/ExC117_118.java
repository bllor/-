package example;
class block
{
	block(){
		System.out.println("block");
	}
	{//이런식으로 아무것도 없이 나타내는 것이 non-static 블록
	//non-static블록이 가장먼저 수행되고 다음에 생산자가 수행이 된다.
		System.out.println("벽돌");
	}
}
class block2
{
	block2(){
		System.out.println("블럭");
	}
	static {//static블록은 첫 번째 인스턴스를 생성하기 바로 전에 한 번만 수행되는 블록
		System.out.println("콘크리드");
	}
}
public class ExC117_118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		block b1=new block();
		block b2=new block();
		block2 b3=new block2();
		block2 b4=new block2();
	}

}
