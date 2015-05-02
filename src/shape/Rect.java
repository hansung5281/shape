package shape;
public class Rect extends Shape implements Drawable{

	private int width;
	private int height;
<<<<<<< HEAD
	private boolean visible;
	
	
	public Rect(int width, int height,boolean visible) {
		super();
		this.width = width;
		this.height = height;
		this.visible = visible;
		visible(visible);
	}
=======
>>>>>>> 975259a4dc5f7f4d6a1a81010da572a7c75a6f83

	public void draw() {
		System.out.println("사각형을 그립니다.");
	}

<<<<<<< HEAD
	@Override
	public void visible(boolean visible) {
		
		if(visible==true){
			draw();
		}else{
			System.out.println("사각형을 지웁니다.");
		}
	}
	
=======
>>>>>>> 975259a4dc5f7f4d6a1a81010da572a7c75a6f83
	public double calculateArea() {

		return width * height;
	}

}
