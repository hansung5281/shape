package shape;
public class Rect extends Shape implements Drawable{

	private int width;
	private int height;

	public void draw() {
		System.out.println("사각형을 그립니다.");
	}

	public double calculateArea() {

		return width * height;
	}

}
