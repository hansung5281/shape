package shape;

public class Point implements Drawable,Visible{
	
	protected int x;
	protected int y;

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
	@Override
	public void draw() {
		System.out.println("좌표[x= " + x +",y= "+y+"]에 점을 그렸습니다.");
	}

	@Override
	public void visible(boolean visible) {
		if(visible==true){
			draw();
		}else{
			System.out.println("좌표[x= " + x +",y= "+y+"]에 점을 지웠습니다.");
		}
	}
}
