package shape;

<<<<<<< HEAD
public class Point implements Drawable,Visible{
	
	protected int x;
	protected int y;

=======
public class Point implements Drawable{
	protected int x;
	protected int y;

	public Point(){
		System.out.println("call Point호출");
	}
	
>>>>>>> 975259a4dc5f7f4d6a1a81010da572a7c75a6f83
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
	
<<<<<<< HEAD
	
	@Override
	public void draw() {
		System.out.println("좌표[x= " + x +",y= "+y+"]에 점을 그렸습니다.");
	}

	@Override
	public void visible(boolean visible) {
		if(visible==true){
			draw();
=======
	public void show(){
		System.out.println("좌표[x= " + x +",y= "+y+"]에 점을 그렸습니다.");
	}
	
	public void show(boolean visible){
		if(visible==true){
			show();
>>>>>>> 975259a4dc5f7f4d6a1a81010da572a7c75a6f83
		}else{
			System.out.println("좌표[x= " + x +",y= "+y+"]에 점을 지웠습니다.");
		}
	}
<<<<<<< HEAD
=======

	@Override
	public void draw() {
		System.out.println("좌표[x= " + x +",y= "+y+"]에 점을 그렸습니다.");
	}
>>>>>>> 975259a4dc5f7f4d6a1a81010da572a7c75a6f83
}
