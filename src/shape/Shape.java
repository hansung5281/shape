package shape;

<<<<<<< HEAD
public class Shape implements Visible{
	public void draw(){
		System.out.println("��ü���� ������ �׸� �� �����ϴ�. ����ؼ� �������ϼ���.");
	}

	@Override
	public void visible(boolean visible) {
		System.out.println("������ ������ �� �������� ���� �ϼ���.");
=======
public class Shape {
	public void draw(){
		System.out.println("구체적인 도형을 그릴 수 없습니다. 상속해서 재정의하세요.");
>>>>>>> 975259a4dc5f7f4d6a1a81010da572a7c75a6f83
	}
}
