package shape;

public class Circle extends Shape implements Drawable{
	private int width;
	private int height;
	
	public void draw() {
		System.out.println("원을 그립니다.");
	}
}
