package shape;

public class Triangle extends Shape implements Drawable{
	private int width;
	private int height;
	private boolean visible;
	
	public void draw() {
		System.out.println("삼각형을 그립니다.");
	}

	public Triangle(int width, int height,boolean visible) {
		super();
		this.width = width;
		this.height = height;
		this.visible = visible;
		this.visible = visible;
		visible(visible);
	}

	@Override
	public void visible(boolean visible) {
		
		if(visible==true){
			draw();
		}else{
			System.out.println("삼각형을 지웁니다.");
		}
	}
	
	public double calculateArea() {

		return width * height/2;
	}
}
