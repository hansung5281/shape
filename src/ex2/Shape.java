package ex2;

public class Shape implements Visible{
	public void draw(){
		System.out.println("��ü���� ������ �׸� �� �����ϴ�. ����ؼ� �������ϼ���.");
	}

	@Override
	public void visible(boolean visible) {
		System.out.println("������ ������ �� �������� ���� �ϼ���.");
	}
}
