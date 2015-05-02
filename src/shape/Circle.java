package shape;

public class Circle extends Shape implements Drawable{
	
	private int radius;
	private boolean visible;
	
	public Circle(int radius,boolean visible) {
		super();
		this.radius = radius;
		this.visible = visible;
		visible(visible);
	}

	public void draw() {
		System.out.println("원을 그립니다.");
	}

	@Override
	public void visible(boolean visible) {
		if(visible==true){
			draw();
		}else{
			System.out.println("원을 지웁니다.");
		}
	}

	public double calculateArea() {

		return radius*Math.PI;
	}
}
