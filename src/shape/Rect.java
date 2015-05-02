package shape;
public class Rect extends Shape implements Drawable{

	private int width;
	private int height;
	private boolean visible;
	
	
	public Rect(int width, int height,boolean visible) {
		super();
		this.width = width;
		this.height = height;
		this.visible = visible;
		visible(visible);
	}

	public void draw() {
		System.out.println("사각형을 그립니다.");
	}

	@Override
	public void visible(boolean visible) {
		
		if(visible==true){
			draw();
		}else{
			System.out.println("사각형을 지웁니다.");
		}
	}
	
	public double calculateArea() {

		return width * height;
	}

}
