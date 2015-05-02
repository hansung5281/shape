package ex2;

public class Shape implements Visible{
	public void draw(){
		System.out.println("구체적인 도형을 그릴 수 없습니다. 상속해서 재정의하세요.");
	}

	@Override
	public void visible(boolean visible) {
		System.out.println("도형이 보일지 안 보일지를 정의 하세요.");
	}
}
