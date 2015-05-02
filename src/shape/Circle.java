package shape;

public class Circle extends Shape implements Drawable{
<<<<<<< HEAD
	
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
=======
	private int width;
	private int height;
	
	public void draw() {
		System.out.println("원을 그립니다.");
	}
>>>>>>> 975259a4dc5f7f4d6a1a81010da572a7c75a6f83
}
