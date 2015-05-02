package ex2;

public class Circle extends Shape implements Drawable{
	
	private int radius;
	private boolean visible;
	
	public Circle(int radius,boolean visible) {
		super();
		this.radius = radius;
		this.visible = visible;
		visible(this.visible);
	}

	public void draw() {
		System.out.println("���� �׸��ϴ�.");
	}

	@Override
	public void visible(boolean visible) {
		if(visible==true){
			draw();
		}else{
			System.out.println("���� ����ϴ�.");
		}
	}

	public double calculateArea() {

		return radius*Math.PI;
	}
}
